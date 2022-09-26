package com.navs.foxhole.logi.dao;

import java.util.List;

import com.navs.foxhole.logi.entity.Order;

public interface OrderDAO {

	public List<Order> getOrder();

	public void saveOrder(Order order);

	public Order getOrder(int id);

	public void deleteOrder(int id);
}
