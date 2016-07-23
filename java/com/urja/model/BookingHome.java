package com.urja.model;
// Generated Jul 19, 2016 11:26:34 PM by Hibernate Tools 4.3.1.Final

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;

import com.urja.model.util.HibernateUtil;
import com.urja.util.PortalService;

/**
 * Home object for domain model class Booking.
 * @see com.urja.model.Booking
 * @author Hibernate Tools
 */
public class BookingHome {

	private static final Log log = LogFactory.getLog(BookingHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	/*protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}*/

	public void persist(Booking transientInstance) {
		log.debug("persisting Booking instance");
		try {
			sessionFactory.openSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Booking instance) {
		log.debug("attaching dirty Booking instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Booking instance) {
		log.debug("attaching clean Booking instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Booking persistentInstance) {
		log.debug("deleting Booking instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Booking merge(Booking detachedInstance) {
		log.debug("merging Booking instance");
		try {
			Booking result = (Booking) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Booking findById(java.lang.Integer id) {
		log.debug("getting Booking instance with id: " + id);
		try {
			Booking instance = (Booking) sessionFactory.getCurrentSession().get("com.urja.model.Booking", id);
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

	public List findByExample(Booking instance) {
		log.debug("finding Booking instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.urja.model.Booking")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public long getAllBookingCount(String searchValue) {
		log.debug("finding All Booking instance");
		Session session = sessionFactory.openSession();
		long count = 0;
		try {
			Criteria criteria = session.createCriteria("com.urja.model.Booking", "booking");
			if(!"".equals(searchValue)){
				criteria.createAlias("booking.customer", "customer");								
				Criterion cond1 = Restrictions.like("customer.firstname", "%"+searchValue+"%");
				Criterion cond2 = Restrictions.like("customer.middlename", "%"+searchValue+"%");
				Criterion cond3 = Restrictions.like("customer.lastname", "%"+searchValue+"%");
				Criterion cond4 = Restrictions.sqlRestriction("pickuptime1 like '%"+searchValue+"%'");
				
				Criterion cond5 = Restrictions.like("booking.status", "%"+searchValue+"%");
				Criterion cond6 = Restrictions.sqlRestriction("bookingid like '%"+searchValue+"%'");
				Criterion cond7 = Restrictions.sqlRestriction("phone1 like '%"+searchValue+"%'");
				Criterion criterion0 = Restrictions.or(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
				
				criteria.add(criterion0);
			}
			count = (long) criteria.setProjection(Projections.rowCount()).uniqueResult();
			
		} catch (RuntimeException re) {
			log.error("getAllBookingCount failed", re);
			throw re;
		}finally {
			session.close();
		}
		return count;
	}

	public JSONArray getAllBookingOrders(String order, String orderColumn, int maxResult, int startResult, String searchValue) {
		log.debug("finding All Booking instance");
		Session session = sessionFactory.openSession();
		JSONArray jsonArray = new JSONArray();
		try {
			Criteria criteria = session.createCriteria("com.urja.model.Booking", "booking");
			if("asc".equals(order)){
				criteria.addOrder(Order.asc(orderColumn));
			}else{
				criteria.addOrder(Order.desc(orderColumn));
			}
			criteria.setMaxResults(maxResult);
			criteria.setFirstResult(startResult);
			if(!"".equals(searchValue)){
				criteria.createAlias("booking.customer", "customer");								
				Criterion cond1 = Restrictions.like("customer.firstname", "%"+searchValue+"%");
				Criterion cond2 = Restrictions.like("customer.middlename", "%"+searchValue+"%");
				Criterion cond3 = Restrictions.like("customer.lastname", "%"+searchValue+"%");
				Criterion cond4 = Restrictions.sqlRestriction("pickuptime1 like '%"+searchValue+"%'");
				
				Criterion cond5 = Restrictions.like("booking.status", "%"+searchValue+"%");
				Criterion cond6 = Restrictions.sqlRestriction("bookingid like '%"+searchValue+"%'");
				Criterion cond7 = Restrictions.sqlRestriction("phone1 like '%"+searchValue+"%'");
				Criterion criterion0 = Restrictions.or(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
				
				criteria.add(criterion0);
			}
			List results = criteria.list();
			for(Object object : results){
				Booking booking = (Booking)object;
				Customer customer = booking.getCustomer();
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("col1", "<a href='javascript:' onClick='grtBookingDetail("+booking.getBookingid()+");'> "+booking.getBookingid()+" </a>");
				jsonObject.put("col2", customer.getFirstname() +" "+ customer.getMiddlename() +" "+ customer.getLastname());
				jsonObject.put("col3", customer.getPhone1());
				jsonObject.put("col4", PortalService.getDateTimeFormat(booking.getPickuptime1()));
				jsonObject.put("col5", PortalService.getBookingStatuLabel(booking.getStatus()));
				jsonArray.put(jsonObject);
			}
			log.debug("getAllBookingOrders successful, result size: " + results.size());
		} catch (Exception re) {
			re.printStackTrace();
			log.error("getAllBookingOrders failed", re);
		}finally {
			session.close();
		}
		return jsonArray;
	}
	
	public Integer Save(Booking booking) {
		log.debug("persisting Customer instance");
		Session session = sessionFactory.openSession();
		Integer bookingId = new Integer(0);
		try {
			Transaction transaction = session.beginTransaction();
			bookingId = (Integer)session.save(booking);
			transaction.commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}finally {
			session.close();
		}
		return bookingId;
	}
}
