package com.urja.ctrl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.urja.model.Address;
import com.urja.model.AddressHome;
import com.urja.model.Customer;
import com.urja.model.CustomerHome;
import com.urja.model.Signup;
import com.urja.model.SignupHome;
import com.urja.model.SignupId;
import com.urja.util.PortalService;

@WebServlet("/customer")
public class CustomerCtrl extends HttpServlet {
	private static final Log log = LogFactory.getLog(CustomerCtrl.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PortalService.setRequest(request, session);
		String cmd = PortalService.getString("cmd");
		String redirectPath = PortalService.getContextPath();
		log.info("cmd : "+cmd);

		Integer customerid = (Integer) session.getAttribute("customerid");
		String customerName = (String) session.getAttribute("customerName");

		String firstname = PortalService.getString("firstname");
		String middlename = PortalService.getString("middlename");
		String lastname = PortalService.getString("lastname");
		String email = PortalService.getString("email");
		Long phone2 = PortalService.getLong("phone2");
		String address1 = PortalService.getString("address1");
		String address2 = PortalService.getString("address2");
		String landmark = PortalService.getString("landmark");
		String postalcode = PortalService.getString("postalcode");
		String district = PortalService.getString("district");
		String state = "Odisha";
		String country = "India";
		

		if (customerid != null){

			
			Customer customer = new CustomerHome().findById(customerid);
			customer.setFirstname(firstname);
			customer.setMiddlename(middlename);
			customer.setLastname(lastname);
			customer.setEmail(email);
			customer.setPhone2(phone2);
			
			Address address = new Address();
			address.setCustomer(customer);
			address.setAddress1(address1);
			address.setAddress2(address2);
			address.setLandmark(landmark);
			address.setPostalcode(postalcode);
			address.setDistrict(district);
			address.setState(state);
			address.setCountry(country);
			address.setStampdate(new Date());
			switch (cmd) {
				case "continueSignUp":{
						customer = new CustomerHome().merge(customer);
						session.setAttribute("customerName", PortalService.getCustomerName(customer));
						new AddressHome().persist(address);
					}				
					break;
		
				default:
					break;
			}
		}
		response.sendRedirect(redirectPath);
		return;
	}

}
