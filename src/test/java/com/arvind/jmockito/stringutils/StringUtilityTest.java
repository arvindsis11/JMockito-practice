package com.arvind.jmockito.stringutils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class StringUtilityTest {
	
	  static Stream<String[]> testArguments() {
	        return Stream.of(
	            new String[]{"Hello, ", "World!", "Hello, World!"},
	            new String[]{"JUnit ", "5", "JUnit 5"},
	            new String[]{"", "Testing", "Testing"}
	        );
	    }
	
	@ParameterizedTest
	@MethodSource("testArguments")
	void testConcatinateStrings(String s1,String s2,String expected) {
		
		StringUtility obj = new StringUtility();
		String res = obj.concatinateStrings(s1, s2);
		assertEquals(expected, res);
		
	}

}
