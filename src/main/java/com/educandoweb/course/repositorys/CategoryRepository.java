package com.educandoweb.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
    
}