package com.capgemini.sorting.set;

public class Employee1 implements Comparable<Employee1> {
int id;
String name;
double salary;
public Employee1(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public int compareTo(Employee1 r) {
	if(this.id>r.id ) {
		return 1;
	}else if(this.id<r.id) {
		return -1;
	}else {
		return 0;
	}
}


}
