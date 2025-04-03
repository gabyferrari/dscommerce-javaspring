package com.devsuperior.dscommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.services.ProductService;

@RestController //configurar para q quando a aplicação rodar, o que implementar nessa classe vai estar respondendo pela web
@RequestMapping(value = "/products") //configura a rota
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/{id}") //responder pela rota /products e pelo método get
	public ProductDTO findById(@PathVariable Long id) {
	   ProductDTO dto = service.findById(id);
	   return dto;
	}

}
