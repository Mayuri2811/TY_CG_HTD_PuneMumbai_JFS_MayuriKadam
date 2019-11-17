package com.capgemini.objectclass.methods;

public class TestA {

	public static void main(String[] args) {
Pen p=new Pen();
int add= p.hashCode();
System.out.println("Address is"+add);
Pen h= new Pen();
int add1= h.hashCode();
System.out.println("Address id"+add1);
	}

}

