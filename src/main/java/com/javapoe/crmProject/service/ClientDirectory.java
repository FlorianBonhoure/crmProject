package com.javapoe.crmProject.service;

import java.util.List;
import java.util.Optional;

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
	
	public Optional<Client> getOneClient(Long id) {
		return clientRepository.findById(id);
	}
	
	public void addClient(Client client) {
		clientRepository.save(client);
	}
	
	public boolean deleteClient(Long id) {
		if(clientRepository.existsById(id)) {
			clientRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
	public boolean updateClient(Client client) {
		if(clientRepository.existsById(client.getId())) {
			clientRepository.save(client);
			return true;
		} 
		return false;
	}
	
	public boolean patchClient(Client client, Long id) {
		Optional<Client> optionalClient = clientRepository.findById(id);
		if(optionalClient.isPresent()) {
			Client c = optionalClient.get();
			c.patch(client);
			clientRepository.save(c);
			return true;
		} 
		return false;
	}
}
