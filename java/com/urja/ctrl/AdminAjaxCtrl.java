package com.urja.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
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
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.google.common.base.Optional;
import com.urja.model.Booking;
import com.urja.model.BookingHome;
import com.urja.model.Serviceitems;
import com.urja.util.PortalService;

@WebServlet("/adminAjax")
public class AdminAjaxCtrl extends HttpServlet {
	private static final Log log = LogFactory.getLog(AdminAjaxCtrl.class);
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("Ajax page");
		response.setHeader("Content-Type", "application/json; charset=UTF-8");
		HttpSession session = request.getSession();
		PortalService.setRequest(request, session);
		
		String cmd = PortalService.getString("cmd");
		JSONObject responseJsonObj = new JSONObject(); 
		

		int orderByColIndex = PortalService.parseInt(request.getParameter("order[0][column]"));
	    int startResult = PortalService.parseInt(request.getParameter("start")); 
	    int maxResult = PortalService.parseInt(request.getParameter("length"));
	    String sEcho = request.getParameter("echo");	
	    String order = request.getParameter("order[0][dir]");
	    String searchValue = request.getParameter("search[value]");

	    
		
		switch(cmd){
			case "bookingDetailSample_1":
				try {
					long bookingCount = new BookingHome().getAllBookingCount(searchValue);
					String orderByColS[] = {"booking.bookingid", "customer.firstname", "customer.phone1", "booking.pickuptime1", "booking.status"};
					JSONArray jsonArray = new BookingHome().getAllBookingOrders(order, orderByColS[orderByColIndex], maxResult, startResult, searchValue);
					
					responseJsonObj.put("draw", 0);
					responseJsonObj.put("recordsTotal", bookingCount);
					responseJsonObj.put("recordsFiltered", bookingCount);
					responseJsonObj.put("data", jsonArray);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace(); 
				} 
				
				break;
		}

		
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    System.out.println("------------json object\n"+responseJsonObj.toString());
	    response.getWriter().write(responseJsonObj.toString());
	}

}
