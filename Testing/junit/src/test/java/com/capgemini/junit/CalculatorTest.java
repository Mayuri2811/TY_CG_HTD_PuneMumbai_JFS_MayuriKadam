package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calculator=null;
	
	@BeforeEach
	public void createObject() {
		calculator=new Calculator();
	}

	@Test
	public void addTest() {
		int i=calculator.add(10, 5);
		assertEquals(15, i);
	}
	
	@Test
	public void subTest() {
		int i=calculator.sub(10, 5);
		assertEquals(5, i);
	}
	
	@Test
	public void mulTest() {
		int i=calculator.mul(10, 5);
		assertEquals(50, i);
	}
	
	@Test
	public void divTest() {
		double i=calculator.divide(10, 5);
		assertEquals(2, i);
	}
	
	@Test
	public void factorialTest() {
		int i=calculator.factorial(4);
		assertEquals(24, i);
	}
	
	@Test
	public void factorialZeroTest() {
		int i=calculator.factorial(0);
		assertEquals(1, i);
	}
	
	@Test
	public void factorialNegativeTest() {
		int i=calculator.factorial(-6);
		assertEquals(1, i);
	}
	@Test
	public void addNegativeTest() {
		int i=calculator.add(-10, 5);
		assertEquals(-5, i);
	}
	
	@Test
	public void divZeroTest() {
		assertThrows(ArithmeticException.class,()->calculator.divide(10, 0) );
	}
}
