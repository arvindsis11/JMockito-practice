package com.arvind.jmockito.apis;

import java.util.List;

public interface TodoService {
	public List<String> retrieveTodos(String user);
	
	void deleteTodos(String name);
}