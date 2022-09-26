package com.navs.foxhole.logi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navs.foxhole.logi.dao.OrderDAO;
import com.navs.foxhole.logi.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;
	
	@Override
	@Transactional
	public List<Order> getOrder() {
		
		List<Order> lCustomers = orderDAO.getOrder();
		return lCustomers;
	}

	@Override
	@Transactional
	public void saveOrder(Order order) {

		orderDAO.saveOrder( order );
		
	}

	@Override
	@Transactional
	public Order getOrder( int id ) {

		Order order = orderDAO.getOrder( id );
		return order;
	}

	@Override
	@Transactional
	public void deleteOrder(int id) {

		orderDAO.deleteOrder( id );
		
	}

}
