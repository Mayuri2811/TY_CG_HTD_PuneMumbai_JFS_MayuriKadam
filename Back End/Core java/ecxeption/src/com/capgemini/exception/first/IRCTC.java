package com.capgemini.exception.first;

public class IRCTC {
void confirm() {
	System.out.println("confirm started");
	try{
		System.out.println(10/0);
	}
	catch(ArithmeticException a) {
		
	System.out.println("exception caught at confirm");
	}
	System.out.println("confirm ended");
}
}
