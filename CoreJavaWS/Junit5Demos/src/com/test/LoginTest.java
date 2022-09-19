package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.demos.Login;

class LoginTest {
	Login log=new Login();

	
	@BeforeEach
	public void setUp() {
		log.prepare();
	}
	
	
	
	@Test
	void testLoginShouldTrue() {
		Boolean expected = true;
		Boolean actual = log.validateLogin("abc", "abc");
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testLoginShouldFalse() {
		Boolean expected = false;
		Boolean actual = log.validateLogin("abc", "abc1");
		assertEquals(expected, actual);
	}
	@ParameterizedTest
	
	@CsvSource({"abc, abc, true",
				"abc1, abc1, true",
				"abc1, abc, false"})
	void testParameterizedLogin(String username,String password, boolean result)
	{

		Boolean actual = log.validateLogin(username,password);
		assertEquals(result, actual);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void palindromes(String candidate) {
	    assertTrue(isPalindrome(candidate));
	    
	}
	
	public boolean isPalindrome(String text) {
	    String clean = text.replaceAll("\\s+", "").toLowerCase();
	    int length = clean.length();
	    int forward = 0;
	    int backward = length - 1;
	    while (backward > forward) {
	        char forwardChar = clean.charAt(forward++);
	        char backwardChar = clean.charAt(backward--);
	        if (forwardChar != backwardChar)
	            return false;
	    }
	    return true;
	}
	@ParameterizedTest
	@MethodSource("provideStringsForIsBlank")
	void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input, boolean expected) {
	    assertEquals(expected, input.isBlank());
	}
	
	private static Stream<Arguments> provideStringsForIsBlank() {
	    return Stream.of(
	      Arguments.of(null, true),
	      Arguments.of("", true),
	      Arguments.of("  ", true),
	      Arguments.of("not blank", false)
	    );
	}
	@ParameterizedTest
	@MethodSource
	void testWithDefaultLocalMethodSource(String argument) {
	    assertNotNull(argument);
	}

	static Stream<String> testWithDefaultLocalMethodSource() {
	    return Stream.of("apple","banana");
	}

}
