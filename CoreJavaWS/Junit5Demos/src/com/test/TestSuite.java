package com.test;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@Suite
//@SelectPackages
@SelectClasses({CalculatorTest.class, LoginTest.class, ClassTagA.class})
@IncludeTags("dev")
public class TestSuite {

	@Test
	public void test()
	{
		
	}

}
