package com.capgemini.exception.first;

public class BMS {

	public static void main(String[] args) {
		System.out.println("main started");
PVR p=new PVR();
try {
	p.confirm();
}
catch(ArithmeticException a) {
	System.out.println("exception caught at BMS");
}
System.out.println("main ended");
	}

}
