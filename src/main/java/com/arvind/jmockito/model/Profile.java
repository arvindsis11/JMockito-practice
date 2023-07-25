package com.arvind.jmockito.model;

public class Profile {

	private String username;
	private String points;

	public Profile(String username, String points) {
		this.username = username;
		this.points = points;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

}
