package com.code2.adminportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code2.adminportal.entity.Orders;
import com.code2.adminportal.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@GetMapping("")
	public String showOrders(Model model) {
		List<Orders>orders=orderService.getOrders();
		model.addAttribute("orders",orders);
		return"orders/index";
	}
	@GetMapping("/show")
	public String showOrder(@RequestParam("id")Long id,Model model) {
		Orders order=orderService.getOrderById(id);
		model.addAttribute("order",order);
		return "orders/detail";
	}
	@GetMapping("/delete")
	public String deleteOrder(@RequestParam("id")Long id) {
		orderService.deleteOrderById(id);
		return"redirect:";
	}
}
