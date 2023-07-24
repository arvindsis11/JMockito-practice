package com.arvind.jmockito.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArrayCompareTest {
	
	@Test
	void testCompareArray() {
		int[] nums = {13,43,22,6,3};
		int[] expected = {3,6,13,22,43};
		Arrays.sort(nums);
		assertArrayEquals(expected, nums);
	}

}
