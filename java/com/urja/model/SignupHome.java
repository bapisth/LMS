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
import com.urja.util.PortalService;

/**
 * Home object for domain model class Signup.
 * @see com.urja.model.Signup
 * @author Hibernate Tools
 */
public class SignupHome {

	private static final Log log = LogFactory.getLog(SignupHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


	public void persist(Signup transientInstance) {
		Session session = sessionFactory.openSession();
		log.debug("persisting Signup instance");
		try {
			Transaction transaction = session.beginTransaction();
			session.persist(transientInstance);
			transaction.commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}finally {
			session.close();
		}
	}

	public void attachDirty(Signup instance) {
		log.debug("attaching dirty Signup instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Signup instance) {
		log.debug("attaching clean Signup instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Signup persistentInstance) {
		log.debug("deleting Signup instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Signup merge(Signup detachedInstance) {
		log.debug("merging Signup instance");
		try {
			Signup result = (Signup) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Signup findById(com.urja.model.SignupId id) {
		log.debug("getting Signup instance with id: " + id);
		Session session = sessionFactory.openSession();
		Signup instance = null;
		try {
			instance = (Signup) session.get("com.urja.model.Signup", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			} 
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}finally {
			session.close();
		}
		return instance;
	}

	public List findByExample(Signup instance) {
		//log.debug("finding Signup instance by example");
		Session session = sessionFactory.openSession();
		List results = new ArrayList();
		try {
			results = sessionFactory.getCurrentSession().createCriteria("com.urja.model.Signup")
					.add(Example.create(instance)).list();
			//log.debug("find by example successful, result size: " + results.size());
		} catch (RuntimeException re) {
			//log.error("find by example failed", re);
		}finally {
			session.close();
		}
		return results;
	}

	public boolean checkValidLogin(Long phone1, String password) {
		//log.debug("finding Customer instance by example");
		Session session = sessionFactory.openSession();
		boolean flag = false; 
		try {
			String sql = "select count(*) from Signup s where s.id.password = '"+password+"' and s.customer.phone1 = "+phone1;
			Query query = session.createQuery(sql);
			List results = query.list();
			if(results!=null && results.size()>0){
				Object objects = (Object)results.get(0);
				int count = PortalService.parseInt(objects.toString());
				flag = count == 1;
			}
			//log.debug("find by example successful, result size: " + results.size());
		} catch (RuntimeException re) {
			re.printStackTrace();
			//log.error("find by example failed", re);
		}finally {
			session.close();
		}
		return flag;
	}
}
