package com.student.mproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.mproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
