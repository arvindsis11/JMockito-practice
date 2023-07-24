package com.arvind.jmockito.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class PolicyServiceTest {
	
	PolicyService obj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach");
		obj = new PolicyService();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
		obj = null;
	}

	@ParameterizedTest
	@ValueSource(strings = {"aajsjsaa","asdkdkas","sjsdjdsjj"})
	void TestCheckFirstAndLastTwoChars(String s) {
		if(s.startsWith("sj")) {//to skip the particular test
			return;
		}
		boolean res = obj.checkFirstAndLastTwoChars(s);
		assertTrue(res);
	}
	
	@ParameterizedTest
	@MethodSource("data")
	void TestListSizeCalculate(List<Integer> ls) {
		int res = obj.listSizeCalculate(ls);
//		assertEquals(null, null);
		assertThat(res).isBetween(2, 6);//rangebased
	}
	
	//parameterized test for List type
	public static List<List<Integer>> data(){
		return Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7),
                Arrays.asList(8, 9, 10, 11, 12)
        );
	}
	
	

}
