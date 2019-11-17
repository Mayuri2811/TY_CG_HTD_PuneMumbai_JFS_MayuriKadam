package com.capgemini.exception.custom;

public class InvalidAgeException extends RuntimeException {
	private String message="Invalid age to proceed";
	@Override
	public String getMessage() {
		return message;
	}
}
