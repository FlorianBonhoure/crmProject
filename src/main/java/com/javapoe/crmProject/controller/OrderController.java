package com.javapoe.crmProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("orders")
	public void addOrder(@RequestBody Order order) {
		orderDirectory.addOrder(order);
	}
	
	@DeleteMapping("orders/{id}")
	public ResponseEntity deleteOrder(@PathVariable("id") Long id) {
		if(orderDirectory.deleteOrder(id)) {
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
