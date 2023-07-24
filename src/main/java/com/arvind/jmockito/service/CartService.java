package com.arvind.jmockito.service;

import com.arvind.jmockito.model.Product;

public class CartService {
	
	public String addItem(Product p) {
		if(!p.isStatus()) {
			throw new IllegalArgumentException("product should be available");
		}
		return "product added";
	}

}
