package com.ciexample.CIExample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class App2Test {
	private App app;
	@Before
	public void setup() {
		// TODO Auto-generated method stub
		app=new App();
	}
	@Test
	public void testSayHello() {
	assertEquals("hallo", app.sayHello());
	}

}
