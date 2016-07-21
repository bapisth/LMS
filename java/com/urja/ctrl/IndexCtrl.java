package com.urja.ctrl;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;

import com.google.common.base.Optional;
import com.google.common.cache.LoadingCache;
import com.urja.model.Address;
import com.urja.model.AddressHome;
import com.urja.model.Customer;
import com.urja.model.CustomerHome;
import com.urja.model.Items;
import com.urja.model.Serviceitems;
import com.urja.model.Services;
import com.urja.util.PortalService;

@WebServlet("/portal")
public class IndexCtrl extends HttpServlet {
	private Customer customer;
	private Address customerAddress;
	private static final Log log = LogFactory.getLog(IndexCtrl.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		PortalService.setRequest(request, session);
		String cmd = PortalService.getString("cmd");
		TilesContainer container = TilesAccess.getContainer(session.getServletContext());
		request.setAttribute("topStyle", "background-image: url('images/parallax/9.jpg'); padding: 120px 0;");

		Integer customerid = (Integer) session.getAttribute("customerid");
		String customerName = (String) session.getAttribute("customerName");
		String redirectPath = "laundry.home";
		
		System.out.println("customer ID======="+customerid);
		System.out.println("customerName======="+customerName);
		
		//Testing Cache.....
		LoadingCache<Integer, Optional<List<Items>>> itemsLoadingCache = PortalService.getItemsLoadingCache();
		try {
			Optional<List<Items>> optional = itemsLoadingCache.get(1);
			List<Items> list = optional.get();
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Items items = (Items) iterator.next();
				System.out.println("========"+items.getItemname()+"==========");
			}
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoadingCache<Integer, Optional<List<Services>>> servicesLoadingCache = PortalService.getServicesLoadingCache();
		try {
			Optional<List<Services>> optional = servicesLoadingCache.get(1);
			List<Services> list = optional.get();
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Services services = (Services) iterator.next();
				System.out.println("<<<<<---------"+services.getServicename());
			}
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoadingCache<Integer, Optional<List<Serviceitems>>> serviceItemsLoadingCache = PortalService.getServiceItemsLoadingCache();
		try {
			Optional<List<Serviceitems>> optional = serviceItemsLoadingCache.get(1);
			List<Serviceitems> list = optional.get();
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Serviceitems serviceitems = (Serviceitems) iterator.next();
				System.out.println("-->>>>>>>>"+serviceitems.getItems().getItemname()+"<<<<<<<<<<<<");
			}
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Cache Testing Completed

		log.info("portal page");

		if (customerid != null){
			switch (cmd) {
			case "myProfile":
				System.out.println("cmd : " + cmd);
				customer = new CustomerHome().findById(customerid);
				request.setAttribute("customer", customer);
				redirectPath = "laundry.myProfile";
				break;
			case "nextSteps":
				System.out.println("cmd : " + cmd);
				customer = new CustomerHome().findById(customerid);
				System.out.println("------------"+customer.getCustomerid());
				customerAddress = new Address();
				customerAddress.setCustomer(customer);
				Address address = new AddressHome().findByCustomer(customerAddress);
				request.setAttribute("customer", customer);
				request.setAttribute("address", address);
				redirectPath = "laundry.nextSteps";
				break;
			case "continueSignUp":
				request.setAttribute("customer", new CustomerHome().findById(customerid));
				redirectPath = "laundry.continueSignUp";
				break;

			default:
				break;
			}
		}
		container.render(redirectPath, request, response);
	}

}
