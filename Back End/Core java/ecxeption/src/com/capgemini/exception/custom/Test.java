package com.capgemini.exception.custom;

public class Test {

	public static void main(String[] args) {
		Validator v =new Validator();
		try {
			v.verify(17);
			System.out.println("Welcome to pub");
		}
		catch(InvalidAgeException in) {
			System.out.println(in.getMessage());
		}
	}

}
