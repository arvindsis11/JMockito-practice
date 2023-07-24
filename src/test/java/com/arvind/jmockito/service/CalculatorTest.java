package com.arvind.jmockito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	//using normal mockito--without annotations

	@Test
	void testAddAndSubstract() {
		MathOperations mockObj = mock(MathOperations.class);
		//prepared mocks
		when(mockObj.add(5, 3)).thenReturn(8);
		when(mockObj.sub(5, 3)).thenReturn(2);
		
		Calculator calc = new Calculator(mockObj);
		
		int res = calc.addAndSubstract(5, 3);
		assertEquals(10, res);
	}

}
