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
		if(a<=0) return 100;
		if(b<=0) return 200;
		String str = "arvind";
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b * add(a, b);
	}
	private String connectionStr() {
		return "connectionapi";
	}
	public String dbconnect(String uname) {
		String connectionStr = connectionStr();
		if(connectionStr==null) {
			String a = "arvind";
			String b = "sisodiya";
			return a+":"+b;
		}
		return connectionStr+":"+uname;
	}
	public String dbconnectV2() {
		String connectionStr = connectionStr();
		if(connectionStr==null) {
			String a = "arvind";
			String b = "sisodiya";
			return a+":"+b;
		}
		return connectionStr;
	}

	public static int square(int num) {
		return num * num;
	}
}
