package com.capgemini.exception.first;

public class Test {

	public static void main(String[] args) {
System.out.println("main started");
Paytm p=new Paytm();
try {
p.book();
}
catch(ArithmeticException e) {
	System.out.println("exception caught at main");
}
System.out.println("main ended");
	}

}
