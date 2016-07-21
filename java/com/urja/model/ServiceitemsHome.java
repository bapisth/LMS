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
 * Home object for domain model class Serviceitems.
 * @see com.urja.model.Serviceitems
 * @author Hibernate Tools
 */
public class ServiceitemsHome {

	private static final Log log = LogFactory.getLog(ServiceitemsHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public Integer Save(Serviceitems serviceitems) {
		log.debug("Saving Serviceitems instance");
		Session session = sessionFactory.openSession();
		Integer serviceItemsId = new Integer(0);
		try {
			Transaction transaction = session.beginTransaction();
			serviceItemsId = (Integer)session.save(serviceitems);
			transaction.commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}finally {
			session.close();
		}
		return serviceItemsId;
	}
	
	public List<Serviceitems> getAllServiceItems(){
		log.info("getAllItems() :Getting all the itmes!!");
		try{
			Session session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Serviceitems.class);
			List<Serviceitems> serviceItems = criteria.list();
			return serviceItems;
		}catch(RuntimeException re){
			log.error("getting all the elements failed!", re);
			throw re;
		}
	}

	public void persist(Serviceitems transientInstance) {
		log.debug("persisting Serviceitems instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Serviceitems instance) {
		log.debug("attaching dirty Serviceitems instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Serviceitems instance) {
		log.debug("attaching clean Serviceitems instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Serviceitems persistentInstance) {
		log.debug("deleting Serviceitems instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Serviceitems merge(Serviceitems detachedInstance) {
		log.debug("merging Serviceitems instance");
		try {
			Serviceitems result = (Serviceitems) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Serviceitems findById(java.lang.Integer id) {
		log.debug("getting Serviceitems instance with id: " + id);
		try {
			Serviceitems instance = (Serviceitems) sessionFactory.getCurrentSession().get("com.urja.model.Serviceitems",
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

	public List findByExample(Serviceitems instance) {
		log.debug("finding Serviceitems instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.urja.model.Serviceitems")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
