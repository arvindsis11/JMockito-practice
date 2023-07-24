package com.arvind.jmockito.service;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculatorTest.class, CalculatorTestMockito.class, CartServiceTest.class, InsuranceServiceTest.class,
		MathOperationsTest.class, PolicyServiceTest.class, ProductServiceTest.class })
public class MockitoTests {

}
