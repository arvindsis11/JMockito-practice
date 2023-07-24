package com.arvind.jmockito.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.arvind.jmockito.model.Product;
import com.arvind.jmockito.repo.ProductRepo;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

	@Mock
	ProductRepo repo;

	@InjectMocks
	ProductService service;

	@Test
	void testGetAllProducts() {
		List<Product> products = Arrays.asList(new Product(1, "apple", true), new Product(2, "oneplus", true), new Product(3, "realMe", false));
		when(repo.findAll()).thenReturn(products);
		assertEquals(3, service.getAllProducts().size());
		verify(repo,times(1)).findAll();
	}

	@Test
	void testGetProductById() {
		Product p = new Product(1,"apple",true);
		Optional<Product> product = Optional.of(p);
		when(repo.findById(1)).thenReturn(product);
		assertThat(service.getProductById(1)).isEqualTo(p);
	}

}
