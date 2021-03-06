package com.urja.model;
// Generated Jul 19, 2016 11:26:34 PM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import com.urja.model.util.HibernateUtil;

/**
 * Home object for domain model class Bookingitems.
 * @see com.urja.model.Bookingitems
 * @author Hibernate Tools
 */
public class BookingitemsHome {

	private static final Log log = LogFactory.getLog(BookingitemsHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	

	public void persist(Bookingitems transientInstance) {
		log.debug("persisting Bookingitems instance");
		Session openSession = sessionFactory.openSession();
		try {
			
			Transaction transaction = openSession.beginTransaction();
			openSession.persist(transientInstance);
			transaction.commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}finally {
			openSession.close();
		}
	}

	public void attachDirty(Bookingitems instance) {
		log.debug("attaching dirty Bookingitems instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Bookingitems instance) {
		log.debug("attaching clean Bookingitems instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Bookingitems persistentInstance) {
		log.debug("deleting Bookingitems instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Bookingitems merge(Bookingitems detachedInstance) {
		log.debug("merging Bookingitems instance");
		try {
			Bookingitems result = (Bookingitems) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Bookingitems findById(java.lang.Long id) {
		log.debug("getting Bookingitems instance with id: " + id);
		try {
			Bookingitems instance = (Bookingitems) sessionFactory.getCurrentSession().get("com.urja.model.Bookingitems",
					id);
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

	public List findByExample(Bookingitems instance) {
		log.debug("finding Bookingitems instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.urja.model.Bookingitems")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
