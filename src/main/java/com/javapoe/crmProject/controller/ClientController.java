package com.javapoe.crmProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@DeleteMapping("clients/{id}")
	public ResponseEntity deleteClient(@PathVariable("id") Long id) {
		if(clientDirectory.deleteClient(id)) {
			return ResponseEntity.ok().build();
		} else{
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("clients/{id}")
	public ResponseEntity updateClient(@PathVariable("id") Long id, @RequestBody Client client) {
		if(client.getId().equals(id)) {
			if(clientDirectory.updateClient(client)) {
				return ResponseEntity.ok().build();
			} else {
				return ResponseEntity.notFound().build();
			}
		} else {
			return ResponseEntity.badRequest().build();
		}
	}
}
