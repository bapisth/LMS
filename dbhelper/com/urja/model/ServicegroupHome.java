package com.urja.model;
// Generated Jul 9, 2016 1:51:15 AM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Servicegroup.
 * @see com.urja.model.Servicegroup
 * @author Hibernate Tools
 */
public class ServicegroupHome {

	private static final Log log = LogFactory.getLog(ServicegroupHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Servicegroup transientInstance) {
		log.debug("persisting Servicegroup instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Servicegroup instance) {
		log.debug("attaching dirty Servicegroup instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Servicegroup instance) {
		log.debug("attaching clean Servicegroup instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Servicegroup persistentInstance) {
		log.debug("deleting Servicegroup instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Servicegroup merge(Servicegroup detachedInstance) {
		log.debug("merging Servicegroup instance");
		try {
			Servicegroup result = (Servicegroup) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Servicegroup findById(com.urja.model.ServicegroupId id) {
		log.debug("getting Servicegroup instance with id: " + id);
		try {
			Servicegroup instance = (Servicegroup) sessionFactory.getCurrentSession().get("com.urja.model.Servicegroup",
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

	public List findByExample(Servicegroup instance) {
		log.debug("finding Servicegroup instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.urja.model.Servicegroup")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
