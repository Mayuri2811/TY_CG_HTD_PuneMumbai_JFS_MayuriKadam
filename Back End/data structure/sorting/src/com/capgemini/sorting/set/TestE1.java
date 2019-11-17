package com.capgemini.sorting.set;

import java.util.HashSet;

public class TestE1 {

	public static void main(String[] args) {
HashSet<Employee> h=new HashSet<Employee>();

Employee e1=new Employee(1, "Mayuri",50000);
Employee e2=new Employee(2, "Manasi",45000);
Employee e3=new Employee(3, "Priyanka",40000);
Employee e4=new Employee(4, "Divya",35000);
Employee e5=new Employee(5, "Aihwarya",30000);
Employee e6=new Employee(2, "Manasi",45000);

h.add(e1);
h.add(e2);
h.add(e3);
h.add(e4);
h.add(e5);
h.add(e6);


for(Employee e:h) {
	System.out.println("Id is: "+e.id);
	System.out.println("Name is: "+e.name);
	System.out.println("Salary is: "+e.salary);
	System.out.println("--------------------------");
}
	
	}

}
