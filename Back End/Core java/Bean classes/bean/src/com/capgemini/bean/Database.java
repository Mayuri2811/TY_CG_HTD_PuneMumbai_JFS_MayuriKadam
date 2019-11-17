package com.capgemini.bean;

public class Database {
void receive(Student t) {
	System.out.println("***********I am Data Base*************");
	System.out.println("Name is:"+t.getName());
	System.out.println("Id is:"+t.getId());
	System.out.println("Height is:"+t.getHeight());
}



void receive(Employee e) {
	System.out.println("***********I am Data Base*************");
	System.out.println("Name is:");
	System.out.println("Id is:");
	System.out.println("Salary is:");
	System.out.println("");
}
}
