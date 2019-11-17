package com.capg.corejava.interface1;

public interface Interface {
	public void print();
	//public void printnum();
	default void display() {
		System.out.println("Default method of interface");
	}
	public static void scan() {
		System.out.println("static method of interface");
	}
}
