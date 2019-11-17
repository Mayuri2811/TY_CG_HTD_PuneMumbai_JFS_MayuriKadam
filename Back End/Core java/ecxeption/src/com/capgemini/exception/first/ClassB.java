package com.capgemini.exception.first;

public class ClassB {
public static void main(String[] args) {
System.out.println("main started");
	int a[]=new int[3];
	String s= null;
	try {
		System.out.println(s.toUpperCase());
		System.out.println(a[0]);
		System.out.println(10/0);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("don't cross array boundry");
	}
	catch(ArithmeticException i) {
		System.out.println("don't divide by zero");
	}
	catch(NullPointerException n) {
		System.out.println("don't deal with null");
	}
	System.out.println("main ended");
}
}
