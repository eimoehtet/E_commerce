package com.code2.adminportal.service;

import java.util.List;


import com.code2.adminportal.entity.Orders;

public interface OrderService {
	public List<Orders> getOrders();

	public Orders getOrderById(Long id);

	public void deleteOrderById(Long id);


}
