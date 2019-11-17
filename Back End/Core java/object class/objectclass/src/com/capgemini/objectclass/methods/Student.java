package com.capgemini.objectclass.methods;

public class Student {
int id;
String name;
double percentage;
public Student(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}
public String toString() {
	return "Name: "+name+", ID: "+id+" , Percentage:"+percentage;
}
}
