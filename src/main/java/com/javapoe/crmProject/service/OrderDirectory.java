package com.javapoe.crmProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javapoe.crmProject.dao.OrderRepository;
import com.javapoe.crmProject.model.Order;

@Service
public class OrderDirectory {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> getAllOrders(){
		return orderRepository.findAll();
	}
}
