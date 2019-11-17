package com.capgemini.selenium.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
Calculator cal=new Calculator();
	
	@Test
	public void addTest() {
		int a=10;
		int b=20;
		int expected=30;
		int actual=cal.add(10,20);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void subTest() {
		int a=20;
		int b=10;
		int expected=10;
		int actual=cal.sub(20,10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void mulTest() {
		int a=10;
		int b=20;
		int expected=200;
		int actual=cal.mul(10,20);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void divTest() {
		int a=20;
		int b=10;
		int expected=2;
		int actual=cal.div(20,10);
		Assert.assertEquals(expected, actual);
	}
}
