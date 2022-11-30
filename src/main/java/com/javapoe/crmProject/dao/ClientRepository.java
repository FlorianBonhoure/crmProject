package com.javapoe.crmProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javapoe.crmProject.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{
	
	List<Client> findAllByCompanyName(String companyName);
	
}
