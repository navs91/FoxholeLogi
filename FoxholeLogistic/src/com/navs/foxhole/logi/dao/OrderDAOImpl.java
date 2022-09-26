package com.navs.foxhole.logi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query; // hibernate 5.2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.navs.foxhole.logi.entity.Order;


@Repository
public class OrderDAOImpl implements OrderDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	//@Transactional // remove funcion cus Service is now in charge
	public List<Order> getOrder() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query ... sort by lastName // Table name is by Java class
		Query<Order> theQuery = currentSession.createQuery( "from Order", Order.class );
		
		//execute query and get result list
		List<Order> lOrder = theQuery.getResultList();
		
		return lOrder;
	}

	@Override
	public void saveOrder( Order order ) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save Customer
		currentSession.saveOrUpdate( order );
	}

	@Override
	public Order getOrder(int id) {

		Session currentSession = sessionFactory.getCurrentSession();
		//Query<Customer> query = currentSession.createQuery( "from Customer where id = " + id, Customer.class );
		Order customer = currentSession.get( Order.class, id );//query.getSingleResult();
		
		return customer;
	}

	@Override
	public void deleteOrder(int id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Query query =currentSession.createQuery( "delete from Customer where id=: id");
		query.setParameter( "id", id );
		
		query.executeUpdate();
		
	}

}
