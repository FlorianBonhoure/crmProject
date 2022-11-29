package com.javapoe.crmProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javapoe.crmProject.dao.ClientRepository;
import com.javapoe.crmProject.dao.OrderRepository;
import com.javapoe.crmProject.model.Client;
import com.javapoe.crmProject.model.Order;

@Service
public class OrderDirectory {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Order> getAllOrders(){
		return orderRepository.findAll();
	}
	
	public void addOrder(Order order) {
		Long clientId = order.getClient().getId();
		Optional<Client> optionalClient = clientRepository.findById(clientId);
		if(optionalClient.isPresent()) {
			Client client = optionalClient.get();
			order.setClient(client);
			orderRepository.save(order);
		}
	}
	
	public boolean deleteOrder(Long id) {
		if(orderRepository.existsById(id)) {
			orderRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
	
}
