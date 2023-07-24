package com.arvind.jmockito.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTestMockito {

	@Mock
	MathOperations mathOp;

	@InjectMocks
	Calculator calc;

	@Test
	void testAddSub() {
		when(mathOp.add(12, 12)).thenReturn(24);
		when(mathOp.sub(12, 12)).thenReturn(1);
		assertThat(calc.addAndSubstract(12, 12)).isEqualTo(25);
		verify(mathOp,times(1)).add(anyInt(), anyInt());
		
	}
	
	public static Stream<int[]> intarr(){//so it internally takes this int[]
		return Stream.of(
				new int[] {1,2},
				new int[] {3,4},
				new int[] {5,6}
				);
	}
	
	

}
