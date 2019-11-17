package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void testAdd() {
		Sum s=new Sum();
		int i=s.add(10, 5);
		assertEquals(15, i);
	} 
	@Test
	public void addTest() {
		Sum s=new Sum();
		int i=s.add(1, 2, 3);
		assertEquals(6, i);
	}

}
