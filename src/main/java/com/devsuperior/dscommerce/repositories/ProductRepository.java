package com.devsuperior.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	//responsável por operações com o banco de dados de produto

}
