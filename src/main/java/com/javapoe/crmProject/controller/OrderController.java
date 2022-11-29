package com.javapoe.crmProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javapoe.crmProject.model.Order;
import com.javapoe.crmProject.service.OrderDirectory;

@RestController
public class OrderController {

	@Autowired
	private OrderDirectory orderDirectory;
	
	@GetMapping("orders")
	public List<Order> getAllOrders(){
		return orderDirectory.getAllOrders();
	}
}
