package com.capg.corejava.overloading;

public class TestA {
public static void main(String[] args) {
	Facebook f= new Facebook();
	f.login(12345, "abcd");
	f.login("abc@123", "bcde");
}
}
