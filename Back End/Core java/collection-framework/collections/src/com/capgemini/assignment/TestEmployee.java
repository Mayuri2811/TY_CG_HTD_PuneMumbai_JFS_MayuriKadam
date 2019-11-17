package com.capgemini.assignment;

import java.util.LinkedList;

public class TestEmployee {

	public static void main(String[] args) {
		LinkedList<Employee> li=new LinkedList<Employee>();
		Employee e1=new Employee(1, "Dinesh", 50000);
		Employee e2=new Employee(2, "Suresh", 40000);
		Employee e3=new Employee(3, "Mahesh", 30000);


		li.add(e1);
		li.add(e2);
		li.add(e3);

		
		EmployeeHelper h=new EmployeeHelper();
		h.display(li);
	}

}
