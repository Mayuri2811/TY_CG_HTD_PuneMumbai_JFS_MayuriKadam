package com.capgemini.exception.first;

public class ClassC {

	public static void main(String[] args) {
		System.out.println("main started");
		int a[]=new int[3];
		String s= "mayuri";
		try {
			System.out.println(s.toUpperCase());
			System.out.println(a[7]);
			System.out.println(10/0);
		}
		catch(ArithmeticException i) {
			System.out.println("don't divide by zero");
		}
		catch(Exception p) {
			System.out.println("Sorry..!! Something went wrong");
		}
		
		
		System.out.println("main ended");
	}

}
