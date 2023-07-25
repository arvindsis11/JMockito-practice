package com.arvind.jmockito.validationutil;

public class InputValidation {
	
	public boolean validateNullValues(String input) {
		if(input==null) return false;
		return true;
	}
	
	public boolean validateObjectNullValues(Object obj) {
		if(obj==null) return false;
		return true;
	}

}
