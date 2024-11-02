package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Demo.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
