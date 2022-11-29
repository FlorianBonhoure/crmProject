package com.javapoe.crmProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javapoe.crmProject.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

}
