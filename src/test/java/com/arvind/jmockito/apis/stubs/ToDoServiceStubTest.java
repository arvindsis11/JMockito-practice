package com.arvind.jmockito.apis.stubs;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import com.arvind.jmockito.service.ToDoServiceImpl;

class ToDoServiceStubTest {

	@Test
	void testRetrieveTodosUsingStubs() {
		ToDoServiceStub stub = new ToDoServiceStub();
		ToDoServiceImpl todoService = new ToDoServiceImpl(stub);
		List<String> todos = todoService.retrieveTodosRelatedToSpring("arvind");
		assertThat(todos.size()).isEqualTo(2);
		assertThat(todos).isSubsetOf(Arrays.asList("spring","java spring"));
		
	}

}
