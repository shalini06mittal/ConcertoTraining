package com.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.demos.Calculator;

class CalculatorTest {
	
	Calculator cal;
	@BeforeEach
	public void setUp() {
		cal = new Calculator();
		cal.setNo1(30);
		cal.setNo2(20);
	}

	@DisplayName("Test add() of Calculator For pos values")
	@Test
	void testAddShouldReturnPositveValues() {
		//1. create object
		//2. Setting the Value Call the setter
		//3. call the Add Method.
		
//		Calculator cal = new Calculator();
//		cal.setNo1(10);
//		cal.setNo2(30);
		
		int actual = cal.add();
		int expected = 50;
		assertEquals(expected, actual);
	}

	@Test
	void testSubshouldreturnpostivevalue() throws Exception {
//		Calculator cal = new Calculator();
//		cal.setNo1(50);
//		cal.setNo2(30);
		
		int actual = cal.sub();
		int expected = 10;
		assertEquals(expected, actual);
		
	}
	
	@Test
	@Disabled
	void testShouldThrowException() {
		cal.setNo1(20);
		cal.setNo2(30);
		assertThrows(Exception.class, ()->cal.sub());
	}
	
	@Test
	void testFactorialForTimeOut() {
		assertTimeout(Duration.ofSeconds(2), cal::factorial);
		
	}

}
