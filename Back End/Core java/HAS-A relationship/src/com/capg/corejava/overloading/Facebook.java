package com.capg.corejava.overloading;

public class Facebook {
void login(long phone, String password) {
System.out.println("login1 successful..");	
}
void login(String email, String password) {
	System.out.println("login2 successful..");
}
}
