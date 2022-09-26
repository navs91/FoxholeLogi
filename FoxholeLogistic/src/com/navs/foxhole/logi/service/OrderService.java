package com.navs.foxhole.logi.service;

import java.util.List;

import com.navs.foxhole.logi.entity.Order;

public interface OrderService {

	public List<Order> getOrder();

	public void saveOrder(Order order);

	public Order getOrder(int id);

	public void deleteOrder(int id);
}
