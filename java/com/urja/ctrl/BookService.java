package com.urja.ctrl;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.urja.model.Address;
import com.urja.model.AddressHome;
import com.urja.model.Booking;
import com.urja.model.BookingHome;
import com.urja.model.Bookingitems;
import com.urja.model.BookingitemsHome;
import com.urja.model.Customer;
import com.urja.model.CustomerHome;
import com.urja.model.Items;
import com.urja.model.Serviceitems;
import com.urja.model.ServiceitemsHome;
import com.urja.util.PortalService;

/**
 * Servlet implementation class BookService
 */
@WebServlet("/BookService")
public class BookService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setHeader("Content-Type", "application/json; charset=UTF-8");
		System.out.println("Inside doget Method!!");
		HttpSession session = request.getSession(true);
		PortalService.setRequest(request, session);
		int customerId = PortalService.getInt("customerid");
		int addressId = PortalService.getInt("addressid");
		String services = PortalService.getString("services");
		Customer existingCustomer = new CustomerHome().findById(customerId);
		Address existingAddressForExistingCustomer = new AddressHome().findById(addressId);
		try {
			if(!services.isEmpty()){
				JSONArray servicesJsonArray = new JSONArray(services);
				for (int i = 0; i < servicesJsonArray.length(); i++) {
					JSONObject object = servicesJsonArray.getJSONObject(i);
					String serviceType = object.getString("serviceType");
					System.out.println("-------------"+serviceType+"--------------------------");
					JSONArray valueArr  = object.getJSONArray("values");
					for(int j=0; j < valueArr.length(); j++){
						JSONObject valueObject = valueArr.getJSONObject(j);
						String itemName = valueObject.getString("itemname");
						
						String quantity = valueObject.getString("quantity");
						System.out.println("-------------"+itemName);
						System.out.println("-------------"+quantity);
						
						Booking booking = new Booking();
						booking.setAddress(existingAddressForExistingCustomer);
						booking.setCustomer(existingCustomer);
						booking.setBookingdatetime(new Date());
						booking.setPickuptime1(new Date());
						booking.setPickuptime2(new Date());
						booking.setDelivertime1(new Date());
						booking.setDelivertime2(new Date());
						booking.setStatus("P");
						booking.setStampuser(existingCustomer.getFirstname());
						booking.setStampdate(new Date());
						Integer bookingId = new BookingHome().Save(booking);
						booking.setBookingid(bookingId);
						
						/*Items items = new Items();
						items.setItemname(itemName);*/
						
						
						Serviceitems serviceitems = new Serviceitems();
						/*serviceitems.setItems(items);
						serviceitems.setItems(items);
						Integer serviceItemsId = new ServiceitemsHome().Save(serviceitems);*/
						serviceitems.setServiceitemid(Integer.valueOf(serviceType));
						//serviceitems.set
						Bookingitems bookingitems = new Bookingitems();
						bookingitems.setBooking(booking);
						bookingitems.setServiceitems(serviceitems);
						bookingitems.setItemquantity(Integer.valueOf(quantity));
						
						new BookingitemsHome().persist(bookingitems);
					
					}
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
