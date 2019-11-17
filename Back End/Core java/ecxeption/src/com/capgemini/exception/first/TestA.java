package com.capgemini.exception.first;

public class TestA {

	public static void main(String[] args) {
System.out.println("Main started");
try {
	

System.out.println(10/0);
}
catch(ArithmeticException a) {
	System.out.println("please don't divide by zero");
}
System.out.println("main ended");
	}

}
