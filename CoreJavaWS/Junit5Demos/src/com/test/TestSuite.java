package com.test;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@Suite
@SelectClasses({CalculatorTest.class, LoginTest.class})
public class TestSuite {

	@Test
	public void test()
	{
		
	}

}
