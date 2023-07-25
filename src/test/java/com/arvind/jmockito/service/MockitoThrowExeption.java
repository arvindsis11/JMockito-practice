package com.arvind.jmockito.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MockitoThrowExeption {
	
	@Test
	void testThrowMockito() {
		List listMock = mock(List.class);
		when(listMock.add(anyString())).thenThrow(new IllegalArgumentException("invalid data"));
		assertThrows(IllegalArgumentException.class, ()->{
			listMock.add("hello");
		});
	}

}
