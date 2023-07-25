package com.arvind.jmockito.parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class TestParameters {

	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5})
	void testIntArgumentsParameter(int n) {
		System.out.println(n);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"a","b","c","d"})
	void testStringArguments(String str) {
	System.out.println(str);
	}
	
	@ParameterizedTest
	@CsvSource({"2,3,4","5,6,7"})
	void testArgumentsParameters(int a,int b,int c) {
		System.out.println();
		System.out.print(" a: "+a+" b: "+b+" c: "+c);
	}
	
	@ParameterizedTest
	@MethodSource("arrayValues")
	void testArrayParameters(int[] arr) {
		for(int a:arr) {
			System.out.println(a);
		}
	}
	@ParameterizedTest
	@MethodSource("arrayValues")
	void testArrayParametersExp(int[] arr) {
		System.out.println(arr[0]);
	}
	static Stream<int[]> arrayValues(){
		return Stream.of(new int[] {1,2,3},
				new int[] {4,5,6},
				new int[] {7,8,9}
				);
	}
	@ParameterizedTest
	@MethodSource("arrayValuesInteger")//values with output associated
	void testArrayParametersExpInputOutput(int a,int b,int res) {
		assertEquals((a+b), res);
	}
	static Stream<Integer[]> arrayValuesInteger(){//values with output associated
		return Stream.of(new Integer[] {1,2,3},
				new Integer[] {4,5,9},
				new Integer[] {7,8,15}
				);
	}
	
	@ParameterizedTest
	@MethodSource("arrayListValue")
	void testArrayListParameters(List<Integer> lst) {
		System.out.println(lst);
		
	}
	
	static Stream<List<Integer>> arrayListValue(){
		return Stream.of(
				Arrays.asList(11,22,33),
				Arrays.asList(23,43,54)
				);
	}

}
