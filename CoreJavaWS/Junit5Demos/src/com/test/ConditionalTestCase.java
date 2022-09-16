package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalTestCase {

	@Test
	@EnabledOnOs({OS.MAC,OS.WINDOWS})
	void test_mac_windows() {
		assertTrue(true);
	}
	
	@Test
	@EnabledOnOs({OS.MAC})
	void testMac() {
		assertTrue(true);
	}
	
	@EnabledOnJre(JRE.JAVA_11)
	@Test
	void testJre11() {
		assertTrue(true);
	}
	
	@EnabledOnJre(JRE.JAVA_17)
	@Test
	void testJre17() {
		assertTrue(true);
	}
	
	
	

}
