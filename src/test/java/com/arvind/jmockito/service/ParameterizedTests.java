package com.arvind.jmockito.service;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculatorTest.class, InsuranceServiceTest.class, MathOperationsTest.class })
public class ParameterizedTests {

}
