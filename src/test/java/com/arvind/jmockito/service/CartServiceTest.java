package com.arvind.jmockito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.arvind.jmockito.model.Product;

//@Timeout(1)
class CartServiceTest {

	@Test
	void testAddItem() throws InterruptedException {
//		Thread.sleep(10_000);
		Product p = new Product(1, "oneplus", true);
		CartService service = new CartService();
		String msg = service.addItem(p);
		assertEquals("product added", msg);
	}
	
	@Test
	void testAddItemException() {
		Product p = new Product(1, "oneplus", false);
		CartService service = new CartService();
		assertThrows(IllegalArgumentException.class, ()->{
			service.addItem(p);
		});
	}

}
