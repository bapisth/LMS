package com.urja.model;
// Generated Jul 19, 2016 11:26:34 PM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.urja.model.util.HibernateUtil;

/**
 * Home object for domain model class Services.
 * @see com.urja.model.Services
 * @author Hibernate Tools
 */
public class ServicesHome {

	private static final Log log = LogFactory.getLog(ServicesHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public List<Services> getAllServices() {
		log.debug("getting all the services available!!");
		try{
			Session session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Services.class);
			return criteria.list();
		}catch(RuntimeException re){
			log.error("Error getting all the services!!");
			throw re;
		}
		
		
	}

	public void persist(Services transientInstance) {
		log.debug("persisting Services instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Services instance) {
		log.debug("attaching dirty Services instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Services instance) {
		log.debug("attaching clean Services instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Services persistentInstance) {
		log.debug("deleting Services instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Services merge(Services detachedInstance) {
		log.debug("merging Services instance");
		try {
			Services result = (Services) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Services findById(java.lang.Integer id) {
		log.debug("getting Services instance with id: " + id);
		try {
			Services instance = (Services) sessionFactory.getCurrentSession().get("com.urja.model.Services", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Services> findByExample(Services instance) {
		log.debug("finding Services instance by example");
		try {
			List<Services> results = sessionFactory.getCurrentSession().createCriteria("com.urja.model.Services")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
