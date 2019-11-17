package com.capgemini.exception.first;

public class ClassA {

	public static void main(String[] args) {
System.out.println("main started");
try {
	System.out.println("hello");
	System.out.println(10/0);
	System.out.println("hi");
	System.out.println("keep smiling");
	}
catch(ArithmeticException e) {
	System.out.println("don't divide by zero");
}
System.out.println("main ended");
	}

}
