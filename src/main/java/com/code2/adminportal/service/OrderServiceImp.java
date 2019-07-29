package com.code2.adminportal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2.adminportal.entity.Orders;
import com.code2.adminportal.repository.OrderRepository;

@Service
public class OrderServiceImp implements OrderService {
	@Autowired
	private OrderRepository orderRepository;
	@Override
	@Transactional
	public List<Orders> getOrders() {
		
		return orderRepository.findAll();
	}
	@Override
	@Transactional
	public Orders getOrderById(Long id) {
		
		return orderRepository.getOne(id);
	}
	@Override
	@Transactional
	public void deleteOrderById(Long id) {
		orderRepository.deleteById(id);
		
	}

}
