package com.capgemini.assignment;


import java.util.LinkedList;



public class EmployeeHelper {
	void display(LinkedList<Employee> k) {
		for(Employee s: k) {
			System.out.println("Id is: "+s.id);
			System.out.println("Name is: "+s.name);
			System.out.println("Salary is: "+s.salary);
			System.out.println("-------------------------------");
		}
			
		}
}
