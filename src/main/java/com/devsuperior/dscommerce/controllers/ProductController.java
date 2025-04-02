package com.devsuperior.dscommerce.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repositories.ProductRepository;

@RestController //configurar para q quando a aplicação rodar, o que implementar nessa classe vai estar respondendo pela web
@RequestMapping(value = "/products") //configura a rota
public class ProductController {
	
	@Autowired
	private ProductRepository repository;
	
	@GetMapping //responder pela rota /products e pelo método get
	public String teste() {
	   Optional<Product> result = repository.findById(1L);
	   Product product = result.get();
	   return product.getName();
	}

}
