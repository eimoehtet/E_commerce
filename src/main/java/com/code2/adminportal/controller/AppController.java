package com.code2.adminportal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.code2.adminportal.entity.AppUser;
import com.code2.adminportal.entity.Orders;
import com.code2.adminportal.entity.Product;
import com.code2.adminportal.service.AppUserService;
import com.code2.adminportal.service.OrderService;
import com.code2.adminportal.service.ProductService;


@Controller
public class AppController {
	@Autowired
	private AppUserService appUserService;
	@Autowired
	private ProductService productService;
	@Autowired
	private OrderService orderService;
	
	
	@GetMapping("/")
	public String showHome(Model model) {
		List<AppUser>users=appUserService.getAppUsers();
		List<Product>products=productService.getAllProducts();
		List<Orders>orders=orderService.getOrders();
		
		model.addAttribute("userCount",users.size());
		model.addAttribute("productCount",products.size());
		model.addAttribute("orderCount",orders.size());
		return "home";
	}
	
	
}
