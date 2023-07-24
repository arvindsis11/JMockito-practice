package com.arvind.jmockito.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InsuranceServiceTest {
	InsuranceService  obj;

	@BeforeAll
	public static void testRun() {
		System.out.println("before all");
	}
	
	@BeforeEach
	void setup() {
		obj = new InsuranceService();
		System.out.println("before each");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("after each");
	}
	
	@AfterAll
	public static void testTerminate() {
		System.out.println("after all");
	}
	
	@Test
	void testSayHello() {
		String msg = "arvind";
		String actual = obj.sayHello(msg);
		assertThat("Hello arvind").isEqualTo(actual);
	}
	
	@Test
	void testSayHelloInvalid() {
		String actual = obj.sayHello("testingfail");
		assertNotEquals("hello testingfail", actual);
	}
	

	@ParameterizedTest
	@ValueSource(strings = {"AACD","CDAA","ACDB"})
	void testTruncateAInFirst2Positions(String input) {
		String res = obj.truncateAInFirst2Positions(input);
		assertThat(res.substring(0,2).contains("A")).isNotEqualTo(true);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8,10})
	void testEvenNumbersCheck(int n) {
		
		boolean evenNumbersCheck = obj.evenNumbersCheck(n);
		assertTrue(evenNumbersCheck);
		
	}

}
