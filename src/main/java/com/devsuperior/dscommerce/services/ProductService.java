package com.devsuperior.dscommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repositories.ProductRepository;

@Service
public class ProductService {
	 
	@Autowired
	private ProductRepository repository;
	             
	@Transactional(readOnly = true)       //metodo q vai receber de argumento um id e retornar um ProductDTO a apartir deese id
	public ProductDTO findById(Long id) { //ele vai no banco de dados buscar o produto, converter para dto e retornar
		Optional<Product> result = repository.findById(id); //buscar no banco o id e retornar para a variavel result
		Product product = result.get(); //pega o objeto <Product> 
		ProductDTO dto = new ProductDTO(product); //converte os dados dentro do product para dto
		return dto;
	}
	
	@Transactional(readOnly = true)       
	public Page<ProductDTO> findAll(Pageable pageable) { //vai buscar todos os produtos do banco de dados pageada(de 10 em 10 ou 12 em 12)
		Page<Product> result = repository.findAll(pageable); //msm coisa q o de cima só q mais resumido
		return result.map(x -> new ProductDTO(x));
	}

}
