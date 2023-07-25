package com.arvind.jmockito.service;

import java.util.List;
import java.util.stream.Collectors;

import com.arvind.jmockito.apis.TodoService;

public class ToDoServiceImpl {

	TodoService todoService;

	public ToDoServiceImpl(TodoService todoService) {
		this.todoService = todoService;
	}


	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> retrieveTodos = todoService.retrieveTodos(user);
		List<String> filtered = retrieveTodos.stream().filter(todo -> todo.contains("spring"))
				.collect(Collectors.toList());
		return filtered;
	}
	
	public void deleteTodoNotSpring(String name) {
		List<String> todos = todoService.retrieveTodos(name);
		for(String todo:todos) {
			if(!todo.contains("spring")) {
				todoService.deleteTodos(todo);
			}
		}
	}

}
