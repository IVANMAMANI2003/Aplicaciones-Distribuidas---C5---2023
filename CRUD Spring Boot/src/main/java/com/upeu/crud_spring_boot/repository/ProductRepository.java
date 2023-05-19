package com.upeu.crud_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upeu.crud_spring_boot.entity.Producto;

public interface ProductRepository extends JpaRepository<Producto,Integer>{
    
}
