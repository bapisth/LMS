package com.urja.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

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
		try {
			if(!services.isEmpty()){
				JSONArray servicesJsonArray = new JSONArray(services);
				for (int i = 0; i < servicesJsonArray.length(); i++) {
					JSONObject object = servicesJsonArray.getJSONObject(i);
					System.out.println("-------------"+object.getString("serviceType"));
					JSONArray valueArr  = object.getJSONArray("values");
					for(int j=0; j < valueArr.length(); j++){
						JSONObject valueObject = valueArr.getJSONObject(j);
						System.out.println("-------------"+valueObject.getString("itemname"));
						System.out.println("-------------"+valueObject.getString("quantity"));
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
