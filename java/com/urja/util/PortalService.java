package com.urja.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.urja.model.Customer;
import com.urja.model.CustomerHome;

public class PortalService {
	

	private static HttpServletRequest request;
	private static HttpSession session; 
	private static String ContextPath;
	private static String SystemPath;
	private static final Log log = LogFactory.getLog(PortalService.class);
	
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

	public static String getContextPath() {
		return ContextPath;
	}

	public static String getSystemPath() {
		return SystemPath;
	}
	
	
}
