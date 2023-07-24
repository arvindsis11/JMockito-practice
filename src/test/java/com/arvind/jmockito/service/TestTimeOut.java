package com.arvind.jmockito.service;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
public class TestTimeOut {
	
	@Test
	@Timeout(1)
	void testMethodTime() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	@Timeout(5)
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 4, 5})
	void eachTestShouldFailAfterOneSecond(int input) throws InterruptedException {
	    Thread.sleep(1100);
	}
	
	@Test
	@Timeout(value = 1,unit = TimeUnit.MINUTES)
	void testChangeTimeUnit() throws InterruptedException{
		Thread.sleep(10_000);
	}

}
