package com.ikytus.kdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ikytus.kdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByOrderByNameAsc();
}
