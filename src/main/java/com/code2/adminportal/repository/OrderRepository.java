package com.code2.adminportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code2.adminportal.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
