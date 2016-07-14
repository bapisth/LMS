package com.urja.model;
// Generated Jul 9, 2016 1:51:15 AM by Hibernate Tools 4.3.1.Final

import java.util.ArrayList;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import com.urja.model.util.HibernateUtil;

/**
 * Home object for domain model class Customer.
 * @see com.urja.model.Customer
 * @author Hibernate Tools
 */
public class CustomerHome {

	private static final Log log = LogFactory.getLog(CustomerHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();



	public Integer Save(Customer transientInstance) {
		log.debug("persisting Customer instance");
		Session session = sessionFactory.openSession();
		Integer customerId = new Integer(0);
		try {
			Transaction transaction = session.beginTransaction();
			customerId = (Integer)session.save(transientInstance);
			transaction.commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}finally {
			session.close();
		}
		return customerId;
	}


	public void persist(Customer transientInstance) {
		log.debug("persisting Customer instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Customer instance) {
		log.debug("attaching dirty Customer instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Customer instance) {
		log.debug("attaching clean Customer instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Customer persistentInstance) {
		log.debug("deleting Customer instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Customer merge(Customer detachedInstance) {
		log.debug("merging Customer instance");
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			Customer result = (Customer) session.merge(detachedInstance);
			log.debug("merge successful");
			transaction.commit();
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}finally {
			session.close();
		}
	}

	public Customer findById(java.lang.Integer id) {
		log.debug("getting Customer instance with id: " + id);
		Session session = sessionFactory.openSession();
		try {
			Customer instance = (Customer) session.get("com.urja.model.Customer", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}finally {
			session.close();
		}
	}

	public List findByExample(Customer instance) {
		//log.debug("finding Customer instance by example");
		Session session = sessionFactory.openSession();
		List results = new ArrayList();
		try {
			results = session.createCriteria("com.urja.model.Customer")
					.add(Example.create(instance)).list();
			//log.debug("find by example successful, result size: " + results.size());
		} catch (RuntimeException re) {
			//log.error("find by example failed", re);
		}finally {
			session.close();
		}
		return results;
	}

	public Customer findByPhone1(long phone1) {
		//log.debug("finding Customer instance by example");
		Session session = sessionFactory.openSession();
		Customer customer = new Customer();
		try {
			String sql = "select c from com.urja.model.Customer c where c.phone1 = "+phone1;
			Query query = session.createQuery(sql);
			List results = query.list();
			if(results != null && results.size()>0)
				customer = (Customer)results.get(0);
			//log.debug("find by example successful, result size: " + results.size());
		} catch (RuntimeException re) {
			re.printStackTrace();
			//log.error("find by example failed", re);
		}finally {
			session.close();
		}
		return customer;
	}
}
