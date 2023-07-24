package com.arvind.jmockito.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arvind.jmockito.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
