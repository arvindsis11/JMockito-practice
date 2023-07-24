package com.arvind.jmockito.service;

import java.util.List;

import com.arvind.jmockito.model.Product;
import com.arvind.jmockito.repo.ProductRepo;

public class ProductService {
	
	ProductRepo productRepo;
	
	public ProductService(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
	
	public Product getProductById(Integer id) {
		return productRepo.findById(id).get();
	}
	

}
