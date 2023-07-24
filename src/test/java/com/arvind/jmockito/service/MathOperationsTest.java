package com.arvind.jmockito.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class MathOperationsTest {

	MathOperations obj;

	@BeforeEach
	void setUp() {
		obj = new MathOperations();
		Arrays.asList(1,2,3);
	}

	@Test
	void testAdd() {
		assertEquals(4, obj.add(2, 2));
	}

	@Test
	void testSub() {
		assertThat(obj.sub(10, 2)).isEqualTo(8);
	}

	@Test
	void testMult() {
		assertEquals(100, obj.mult(10, 10));
	}

	static Stream<int[]> testArguments() {
		return Stream.of(new int[] { 1, 2 }, // int a = 1, int b = 2
				new int[] { 5, 3 }, // int a = 5, int b = 3
				new int[] { 10, 0 } // int a = 10, int b = 0
		);
	}
	
	 static Stream<List<Integer>> testList() {
	        return Stream.of(
	            Arrays.asList(1, 2, 3),  // ArrayList values: [1, 2, 3]
	            Arrays.asList(5, 3, 7),  // ArrayList values: [5, 3, 7]
	            Arrays.asList(10, 0, -5) // ArrayList values: [10, 0, -5]
	        );
	    }
	@ParameterizedTest
	@MethodSource("testArguments")
	void testAddition(int[] args) {
		int a = args[0];  // Get int a from the array
        int b = args[1];  // Get int b from the array
		int sum = a + b;
		assertEquals(a + b, sum);
	}
	
	@ParameterizedTest
	@CsvSource({"2,-1","2,1","12,12"})
	void testSub(int a,int b) {
		int sub = a-b;
		assertEquals(a-b, sub);
	}
	
	
	@ParameterizedTest
	@MethodSource("testList")
	void testListAddition(List<Integer> list) {
		//add elements of the list
		int actual = 0;
		for(int i:list) {
			actual+=i;
		}
		int expected = 0;
		for(int i=0;i<list.size();i++) {
			expected+=list.get(i);
		}
		assertEquals(expected, actual);
	}

}
