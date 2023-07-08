package com.student.mproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.mproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
