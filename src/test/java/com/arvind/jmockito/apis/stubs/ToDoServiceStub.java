package com.arvind.jmockito.apis.stubs;

import java.util.Arrays;
import java.util.List;

import com.arvind.jmockito.apis.TodoService;

public class ToDoServiceStub implements TodoService{

	@Override
	public List<String> retrieveTodos(String user) {
		
		return Arrays.asList("spring","java spring","cpp","nodejs","reactjs");
	}

	@Override
	public void deleteTodos(String name) {
		// TODO Auto-generated method stub
		
	}

}
