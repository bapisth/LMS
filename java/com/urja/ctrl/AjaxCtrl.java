package com.urja.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
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
import com.urja.model.Serviceitems;
import com.urja.util.PortalService;

@WebServlet("/ajax")
public class AjaxCtrl extends HttpServlet {
	private static final Log log = LogFactory.getLog(AjaxCtrl.class);
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("Ajax page");
		response.setHeader("Content-Type", "application/json; charset=UTF-8");
		HttpSession session = request.getSession();
		PortalService.setRequest(request, session);
		
		String cmd = PortalService.getString("cmd");
		JSONObject serviceItemsJsonObject = null; 
		JSONArray serviceItemJsonArray = null;
		JSONObject itemObject = null;
		switch(cmd){
			case "populateServiceItems":
				int serviceId = PortalService.getInt("serviceId");
				if(serviceId > 0){
					try {
						Optional<List<Serviceitems>> nullSafeServiceItems = PortalService.getServiceItemsLoadingCache().get(serviceId);
						List<Serviceitems> serviceItemsList = nullSafeServiceItems.get();
						serviceItemJsonArray = new JSONArray();
						for (Iterator iterator = serviceItemsList.iterator(); iterator.hasNext();) {
							Serviceitems serviceitems = (Serviceitems) iterator.next();
							String itemname = serviceitems.getItems().getItemname();
							Integer itemid = serviceitems.getServiceitemid();
							itemObject = new JSONObject();
							itemObject.put("value", itemid);
							itemObject.put("label", itemname);
							serviceItemJsonArray.put(itemObject);
						}
						serviceItemsJsonObject = new JSONObject();
						serviceItemsJsonObject.put("serviceItems", serviceItemJsonArray);
					}catch (JSONException e) {
						e.printStackTrace();
					} catch (ExecutionException e) {
						e.printStackTrace();
					}
				}
				break;
		}
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    System.out.println("------------json object\n"+serviceItemsJsonObject.toString());
	    response.getWriter().write(serviceItemsJsonObject.toString());
	}

}
