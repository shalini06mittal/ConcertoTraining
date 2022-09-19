package com.test;

import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class ClassTagA {

	@Test
	@Tag("dev")
	public void devTest()
	{
		assertNull(null);
	}
	@Test
	@Tags(value = {@Tag("prod"),@Tag("dev") })
	public void devprodTest()
	{
		assertNull(null);
	}
	@Test
	@Tag("prod")
	public void prodTest()
	{
		assertNull(null);
	}
	
}
