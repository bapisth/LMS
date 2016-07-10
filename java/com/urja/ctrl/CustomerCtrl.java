package com.urja.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.urja.model.Customer;
import com.urja.model.CustomerHome;
import com.urja.model.Signup;
import com.urja.model.SignupHome;
import com.urja.util.PortalService;

@WebServlet("/customer")
public class CustomerCtrl extends HttpServlet {
	private static final Log log = LogFactory.getLog(CustomerCtrl.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PortalService.setRequest(request, request.getSession());
		String cmd = PortalService.getString("cmd");
		log.info("cmd : "+cmd);
		 
		
		
	}

}
