package com.arvind.jmockito.model;

public class Product {
	
	private int id;
	
	private String name;
	
	private boolean status;

	public Product(int id, String name, boolean status) {
	
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
