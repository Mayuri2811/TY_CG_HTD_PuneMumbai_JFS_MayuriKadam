package com.capgemini.objectclass.methods;

public class TestB {
public static void main(String[] args) {
	Pen p=new Pen();
	int add= p.hashCode();
	System.out.println(add);
	String s= p.toString();
	System.out.println(s);
	System.out.println(p);// Direct call for toString method using reference variable
}
}
