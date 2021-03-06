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
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import com.urja.model.util.HibernateUtil;

/**
 * Home object for domain model class Items.
 * @see com.urja.model.Items
 * @author Hibernate Tools
 */
public class ItemsHome {

	private static final Log log = LogFactory.getLog(ItemsHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public List<Items> getAllItems(){
		log.info("getAllItems() :Getting all the itmes!!");
		try{
			Session session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Items.class);
			List<Items> items = criteria.list();
			return items;
		}catch(RuntimeException re){
			log.error("getting all the elements failed!", re);
			throw re;
		}
	}

	public void persist(Items transientInstance) {
		log.debug("persisting Items instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Items instance) {
		log.debug("attaching dirty Items instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Items instance) {
		log.debug("attaching clean Items instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Items persistentInstance) {
		log.debug("deleting Items instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Items merge(Items detachedInstance) {
		log.debug("merging Items instance");
		try {
			Items result = (Items) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Items findById(java.lang.Integer id) {
		log.debug("getting Items instance with id: " + id);
		try {
			Items instance = (Items) sessionFactory.getCurrentSession().get("com.urja.model.Items", id);
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

	public List findByExample(Items instance) {
		log.debug("finding Items instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.urja.model.Items")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
