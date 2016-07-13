package com.urja.ctrl;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.urja.auth.LoginAuthentication;
import com.urja.model.Customer;
import com.urja.model.CustomerHome;
import com.urja.model.Signup;
import com.urja.model.SignupHome;
import com.urja.model.SignupId;
import com.urja.util.PortalService;

@WebServlet("/signup")
public class SignupCtrl extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5709584671370489781L;
	private static final Log log = LogFactory.getLog(SignupCtrl.class);
	LoginAuthentication authentication;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PortalService.setRequest(request, session);
		String cmd = PortalService.getString("cmd");
		String redirectPath = PortalService.getContextPath();
		try {
			authentication = new LoginAuthentication();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		switch (cmd) {
			case "login":{
				long mobile = PortalService.getLong("mobile");
				String password = PortalService.getString("password");
				if(new SignupHome().checkValidLogin(mobile, password)){
					log.info("successfull login");
					Customer customer = new CustomerHome().findByPhone1(mobile);
					session.setAttribute("customerid", customer.getCustomerid());
					session.setAttribute("customerName", PortalService.getCustomerName(customer));
					//redirectPath += "/portal?cmd=myProfile";
					redirectPath += "/portal?cmd=nextSteps";
				}else
					log.info("Having Trouble in Log-in to the Application!!! You may have entered the wrong userid and password.");
				break;
			}
				

			case "signUp":
				long phone1 = PortalService.getLong("mobile");
				String email = PortalService.getString("email");
				String password = PortalService.getString("password");
				String encryptedPassword = authentication.encrypt(password);
				Customer customer = new Customer("", "", "", email, phone1, new Long(0), new Date(), "");
				customer.setCustomerid(new CustomerHome().Save(customer));
				SignupId signupId = new SignupId(customer.getCustomerid(), encryptedPassword, "", "", new Date(), "");
				Signup signup = new Signup(signupId, customer); 
				new SignupHome().persist(signup);
				session.setAttribute("customerid", customer.getCustomerid());
				session.setAttribute("customerName", "");
				redirectPath += "/portal?cmd=continueSignUp";
				break;
			
			default:
				break;
		}
		

		response.sendRedirect(redirectPath);
		return;
	}

}
