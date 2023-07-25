package com.arvind.jmockito.powermockstatic;

public class UserManagement {

	public String getStatus(String name) {
		ValidateUser obj = new ValidateUser();
		String sayBye = SayBye(name);
		return obj.userData(name) + " " + sayBye;
	}

	private String SayBye(String name) {
		// some confidantial api operations
		return "bye " + name;
	}

	public static int getNumber(int number) {
		return number;
	}

	private int add(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b * add(a, b);
	}

	public static int square(int num) {
		return num * num;
	}
}
