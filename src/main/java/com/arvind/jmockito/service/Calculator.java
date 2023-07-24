package com.arvind.jmockito.service;

public class Calculator {
	
	private MathOperations calc;
	//depends on another class
	public Calculator(MathOperations calc) {
		this.calc = calc;
	}
	
	public int addAndSubstract(int a,int b) {
		int add = calc.add(a, b);
		int sub = calc.sub(a, b);
		return add+sub;
	}

}
