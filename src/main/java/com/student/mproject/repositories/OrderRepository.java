package com.student.mproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.mproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
