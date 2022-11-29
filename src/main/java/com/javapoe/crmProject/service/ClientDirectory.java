package com.javapoe.crmProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javapoe.crmProject.dao.ClientRepository;
import com.javapoe.crmProject.model.Client;

@Service
public class ClientDirectory {
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> getAllClients(){
		return clientRepository.findAll();
	}
	
	public void addClient(Client client) {
		clientRepository.save(client);
	}
}
