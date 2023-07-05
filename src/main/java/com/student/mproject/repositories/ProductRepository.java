package com.student.mproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.mproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
