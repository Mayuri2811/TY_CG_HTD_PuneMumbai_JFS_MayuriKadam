package com.capgemini.springcore.beans;

public class MessageBean2 {
private String message;

//getters and Setters

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public void init() {
	System.out.println("Its init phase..");
}

public void destroy() {
	System.out.println("Its destroy phase..");
}

}
