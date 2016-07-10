package com.urja.model.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.urja.model.Address;
import com.urja.model.Backofficeuser;
import com.urja.model.Booking;
import com.urja.model.Customer;
import com.urja.model.Paymentdetail;
import com.urja.model.Servicegroup;
import com.urja.model.Services;
import com.urja.model.Signup;

public class HibernateUtil {
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			if (sessionFactory == null) {
				Configuration configuration = new Configuration().configure(HibernateUtil.class.getResource("/hibernate.cfg.xml"));
				//addClassesToConfiguration(configuration);
				StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
				serviceRegistryBuilder.applySettings(configuration.getProperties());
				ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}
			return sessionFactory;
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	/**
	 * This method is used to handle the "Initial SessionFactory creation failed.org.hibernate.MappingException"
	 * e.g:  
	 * org.hibernate.MappingException: An association from the 
	 * table address refers to an unmapped class: com.urja.model.Customer
	 * @param configuration
	 */
	private static void addClassesToConfiguration(Configuration configuration) {
		configuration.addClass(Address.class);
		configuration.addClass(Customer.class);
		configuration.addClass(Backofficeuser.class);
		configuration.addClass(Booking.class);
		configuration.addClass(Paymentdetail.class);
		configuration.addClass(Servicegroup.class);
		configuration.addClass(Services.class);
		configuration.addClass(Signup.class);
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}
}