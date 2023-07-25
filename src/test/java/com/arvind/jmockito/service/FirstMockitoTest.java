package com.arvind.jmockito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.arvind.jmockito.apis.TodoService;

class FirstMockitoTest {

	@Test
	void testRetrieveTodos() {
		TodoService mockService = mock(TodoService.class);
		when(mockService.retrieveTodos("arvind")).thenReturn(Arrays.asList("spring","java spring"));
		ToDoServiceImpl service = new ToDoServiceImpl(mockService);
		assertEquals(2, service.retrieveTodosRelatedToSpring("arvind").size());
	}

}
