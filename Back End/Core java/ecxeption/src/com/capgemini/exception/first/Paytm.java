package com.capgemini.exception.first;

public class Paytm {
void book() {
	System.out.println("book started");
	IRCTC i=new IRCTC();
	try{
		i.confirm();
	}
	catch(ArithmeticException c) {
		System.out.println("exception caught at book");
	}
	
	System.out.println("book ended");
}
}
