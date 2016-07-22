package com.urja.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.service.spi.ServiceRegistryAwareService;

import com.google.common.base.Optional;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.urja.model.Customer;
import com.urja.model.CustomerHome;
import com.urja.model.Items;
import com.urja.model.ItemsHome;
import com.urja.model.Serviceitems;
import com.urja.model.ServiceitemsHome;
import com.urja.model.Services;
import com.urja.model.ServicesHome;

public class PortalService {
	

	private static HttpServletRequest request;
	private static HttpSession session; 
	private static String ContextPath;
	private static String SystemPath;
	private static final Log log = LogFactory.getLog(PortalService.class);
	private static LoadingCache<Integer, Optional<List<Items>>> itemsLoadingCache;
	private static LoadingCache<Integer, Optional<List<Services>>> servicesLoadingCache;
	private static LoadingCache<Integer, Optional<List<Serviceitems>>> serviceItemsLoadingCache;
	private static int EXPIRE_PRODUCT_AFTER_1_DAY = 1;
	private static int REFRESH_PRODUCT_AFTER_5_SECONDS = 5;
	
	public static void setRequest(HttpServletRequest request, HttpSession session){
		PortalService.request = request;
		PortalService.session = session;
		ContextPath = request.getContextPath();
		SystemPath = request.getSession().getServletContext().getRealPath("/").replace("\\","/");
	}
	
	public static int parseInt(String n){
		int num = 0;
		try {
			num = Integer.parseInt(n);
		} catch (Exception e) {
			log.error("PortalService parseInt() failed", e);
		}
		return num;
	}
	
	public static long parseLong(String n){
		long num = 0;
		try {
			num = Long.parseLong(n);
		} catch (Exception e) {
			log.error("PortalService parseLong() failed", e);
		}
		return num;
	}
	
	public static String parseString(Object obj){
		return obj == null ? "" : obj.toString();
	}
	
	public static String getString(String requestName){
		return parseString(request.getParameter(requestName));
	}
	
	public static int getInt(String requestName){
		return parseInt(request.getParameter(requestName));
	}
	
	public static long getLong(String requestName){
		return parseLong(request.getParameter(requestName));
	}
	
	public static String getCustomerName(Customer customer){
		String customerName = parseString(customer.getFirstname())+ " "; 
		customerName += parseString(customer.getMiddlename())+ " "; 
		customerName += parseString(customer.getLastname()); 
		return customerName.replace("  ", " ");
	}
	
	public static void initializeItemsCache() {
		log.info("PortalService: Initializing the Items Cache!!");
		System.out.println("PortalService: Initializing the Items Cache!!");
		itemsLoadingCache = CacheBuilder.newBuilder()
    			.expireAfterWrite(EXPIRE_PRODUCT_AFTER_1_DAY, TimeUnit.DAYS)
    			.refreshAfterWrite(REFRESH_PRODUCT_AFTER_5_SECONDS, TimeUnit.SECONDS)
    			.maximumSize(1000)
    			.build(new CacheLoader<Integer, Optional<List<Items>>>(){

					@Override
					public Optional<List<Items>> load(Integer arg0) throws Exception {
						// TODO Auto-generated method stub
						ItemsHome itemsHome = new ItemsHome();
						List<Items> items = itemsHome.getAllItems();
						Optional<List<Items>> nullSafeItems = Optional.of(items);
						return nullSafeItems;
					}
    				
    			});
		
	}
	
	public static void initializeServicesCache() {
		log.info("PortalService: Initializing the Services Cache!!");
		System.out.println("PortalService: Initializing the Services Cache!!");
		servicesLoadingCache = CacheBuilder.newBuilder()
				.expireAfterWrite(EXPIRE_PRODUCT_AFTER_1_DAY, TimeUnit.DAYS)
    			.refreshAfterWrite(REFRESH_PRODUCT_AFTER_5_SECONDS, TimeUnit.SECONDS)
				.maximumSize(1000)
				.build(new CacheLoader<Integer, Optional<List<Services>>>(){

					@Override
					public Optional<List<Services>> load(Integer arg0) throws Exception {
						List<Services> services  = new ServicesHome().getAllServices();
						Optional<List<Services>> nullSafedServices = Optional.of(services);
						return nullSafedServices;
					}
				});
	}
	
	public static void initializeServiceItemsByServiceIdCache(){
		log.info("PortalService: Initializing the Serviceitems Cache!!");
		System.out.println("PortalService: Initializing the Serviceitems Cache!!");
		serviceItemsLoadingCache = CacheBuilder.newBuilder()
				.expireAfterWrite(EXPIRE_PRODUCT_AFTER_1_DAY, TimeUnit.DAYS)
    			.refreshAfterWrite(REFRESH_PRODUCT_AFTER_5_SECONDS, TimeUnit.SECONDS)
				.maximumSize(1000)
				.build(new CacheLoader<Integer, Optional<List<Serviceitems>>>(){

					@Override
					public Optional<List<Serviceitems>> load(Integer serviceID) throws Exception {
						System.out.println("====================Serviceid:"+serviceID);
						List<Serviceitems> serviceitems = new ServiceitemsHome().getServiceItemsByServiceId(serviceID);
						Optional<List<Serviceitems>> optionalServiceItems = Optional.of(serviceitems);
						return optionalServiceItems;
					}
				});
	}

	public static String getContextPath() {
		return ContextPath;
	}

	public static String getSystemPath() {
		return SystemPath;
	}

	public static LoadingCache<Integer, Optional<List<Items>>> getItemsLoadingCache() {
		return itemsLoadingCache;
	}

	public static void setItemsLoadingCache(LoadingCache<Integer, Optional<List<Items>>> itemsLoadingCache) {
		PortalService.itemsLoadingCache = itemsLoadingCache;
	}

	public static LoadingCache<Integer, Optional<List<Services>>> getServicesLoadingCache() {
		return servicesLoadingCache;
	}

	public static void setServicesLoadingCache(LoadingCache<Integer, Optional<List<Services>>> servicesLoadingCache) {
		PortalService.servicesLoadingCache = servicesLoadingCache;
	}

	public static LoadingCache<Integer, Optional<List<Serviceitems>>> getServiceItemsLoadingCache() {
		return serviceItemsLoadingCache;
	}

	public static void setServiceItemsLoadingCache(
			LoadingCache<Integer, Optional<List<Serviceitems>>> serviceItemsLoadingCache) {
		PortalService.serviceItemsLoadingCache = serviceItemsLoadingCache;
	}
}
