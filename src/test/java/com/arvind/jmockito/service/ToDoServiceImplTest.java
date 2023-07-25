package com.arvind.jmockito.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.jupiter.MockitoExtension;

import com.arvind.jmockito.apis.TodoService;

@ExtendWith(MockitoExtension.class)
class ToDoServiceImplTest {
	
	@Captor
	ArgumentCaptor<String> argString;

	@Test
	void testRetrieveTodosRelatedToSpring() {
		TodoService mock = mock(TodoService.class);
		List<String> todos = Arrays.asList("java","spring java");
		when(mock.retrieveTodos("arvind")).thenReturn(todos);
		ToDoServiceImpl service = new ToDoServiceImpl(mock);
		assertThat(service.retrieveTodosRelatedToSpring("arvind")).isNotEmpty();
		assertThat(service.retrieveTodosRelatedToSpring("arvind")).isSubsetOf(Arrays.asList("java","spring java"));
		verify(mock,atLeast(1)).retrieveTodos("arvind");
	}

	@Test
	void testDeleteTodoNotSpring() {
		TodoService mock = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("java","spring java");
		when(mock.retrieveTodos("arvind")).thenReturn(allTodos);
		ToDoServiceImpl service = new ToDoServiceImpl(mock);
		service.deleteTodoNotSpring("arvind");
		verify(mock).deleteTodos("java");
		verify(mock,never()).deleteTodos("spring");
		
	}
	
	@Test
	void argumentCapturee() {
		TodoService mockObj = mock(TodoService.class);
		List<String> todosList =  Arrays.asList("java spring",
				"spring mvc", "cpp");
		when(mockObj.retrieveTodos("arvind")).thenReturn(todosList);
		ToDoServiceImpl service = new ToDoServiceImpl(mockObj);
//		ArgumentCaptor<String> argString = ArgumentCaptor.forClass(String.class);
		service.deleteTodoNotSpring("arvind");
		verify(mockObj).deleteTodos(argString.capture());
		assertEquals("cpp", argString.getValue());
		
	}

}
