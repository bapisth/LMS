package com.urja.ctrl;

import java.io.IOException;

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

import com.urja.model.Customer;
import com.urja.model.CustomerHome;
import com.urja.util.PortalService;

@WebServlet("/portal")
public class IndexCtrl extends HttpServlet {
	private static final Log log = LogFactory.getLog(IndexCtrl.class);
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PortalService.setRequest(request, session);
		String cmd = PortalService.getString("cmd");		
		TilesContainer container = TilesAccess.getContainer(session.getServletContext());
		request.setAttribute("topStyle", "background-image: url('images/parallax/9.jpg'); padding: 120px 0;");
		

		Integer customerid = (Integer)session.getAttribute("customerid");
		String customerName = (String)session.getAttribute("customerName");
		String redirectPath = "laundry.testSteps";
		
		log.info("portal page");
		
		if(customerid!=null)	//for signed in uswe
			switch (cmd) {
				case "myProfile":
					System.out.println("cmd : "+cmd);
					Customer customer = new CustomerHome().findById(customerid);
					request.setAttribute("customer", customer);
					redirectPath = "laundry.myProfile";
					break;
		
				default:
					break;
			}
		else{
			
		}
		

		container.render(redirectPath , request, response);
	}

}
