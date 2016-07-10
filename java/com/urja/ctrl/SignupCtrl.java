package com.urja.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.urja.model.Customer;
import com.urja.model.CustomerHome;
import com.urja.model.Signup;
import com.urja.model.SignupHome;
import com.urja.model.SignupId;
import com.urja.util.PortalService;

@WebServlet("/signup")
public class SignupCtrl extends HttpServlet {
	private static final Log log = LogFactory.getLog(SignupCtrl.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PortalService.setRequest(request, session);
		String cmd = PortalService.getString("cmd");
		//log.info("cmd : "+cmd);
		 
		switch (cmd) {
			case "login":
				long mobile = PortalService.getLong("mobile");
				String password = PortalService.getString("password");
				if(new SignupHome().checkValidLogin(mobile, password)){
					log.info("successfull login");
					Customer customer = new CustomerHome().findByPhone1(mobile);
					session.setAttribute("customerid", customer.getCustomerid());
					session.setAttribute("customerName", PortalService.getCustomerName(customer));
					response.sendRedirect(PortalService.getContextPath()+"/portal?cmd=myProfile");
				}else
					log.info("successfully not login");
				break;
	
			default:
				break;
		}
		
		
	}

}
