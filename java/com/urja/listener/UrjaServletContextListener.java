package com.urja.listener;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.common.base.Optional;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.urja.ctrl.AjaxCtrl;
import com.urja.model.Items;
import com.urja.model.ItemsHome;
import com.urja.util.PortalService;

/**
 * Application Lifecycle Listener implementation class ContextInitializeListener
 *
 */
@WebListener
public class UrjaServletContextListener implements ServletContextListener {
	private static final Log log = LogFactory.getLog(UrjaServletContextListener.class);

    /**
     * Default constructor. 
     */
    public UrjaServletContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	log.info("Servlet context initialize listener started!!");
    	System.out.println("Servlet context initialize listener started!!");
    	PortalService.initializeItemsCache();
    	PortalService.initializeServicesCache();
    	PortalService.initializeServiceItemsByServiceIdCache();
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }
	
}
