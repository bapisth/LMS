package com.urja.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;

import com.urja.util.PortalService;

/**
 * Servlet implementation class AdminCtrl
 */

@WebServlet("/portalAdmin")
public class AdminCtrl extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		HttpSession session = request.getSession(true);
		PortalService.setRequest(request, session);
		String cmd = PortalService.getString("cmd");
		TilesContainer container = TilesAccess.getContainer(session.getServletContext());
		String redirectPath = "laundry.bookingDetails";
		
		
		

		container.render(redirectPath, request, response);
	}

	
	
}
