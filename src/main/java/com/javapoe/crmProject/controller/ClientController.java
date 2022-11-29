package com.javapoe.crmProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javapoe.crmProject.model.Client;
import com.javapoe.crmProject.service.ClientDirectory;

@RestController
public class ClientController {

	@Autowired
	private ClientDirectory clientDirectory;
	
	@GetMapping("clients")
	public List<Client> getAllClients(){
		return clientDirectory.getAllClients();
	}
	
	@PostMapping("clients")
	public void addClient(@RequestBody Client client) {
		clientDirectory.addClient(client);
	}
}
