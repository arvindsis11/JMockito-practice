package com.arvind.jmockito.service;

public class InsuranceService {
	
	public String sayHello(String str) {
		return "Hello "+str;
	}
	
	public String truncateAInFirst2Positions(String str) {
		if(str.length()<=2) return str.replaceAll("A", "");
		String first2char = str.substring(0,2);
		return first2char.replaceAll("A", "")+str.substring(2);
	}
	
	public boolean evenNumbersCheck(int n) {
		return n%2==0;
	}
}
