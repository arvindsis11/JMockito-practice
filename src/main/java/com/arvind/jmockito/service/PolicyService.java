package com.arvind.jmockito.service;

import java.util.List;

public class PolicyService {
	
	public boolean checkFirstAndLastTwoChars(String str) {
		if(str.length()<=1) return false;
		if(str.length()==2) return true;
		
		String str1 = str.substring(0,2);
		String str2 = str.substring(str.length()-2);
		return str1.equals(str2);
	}
	
	public int listSizeCalculate(List<Integer> list) {
		return list.size();
	}
	

}
