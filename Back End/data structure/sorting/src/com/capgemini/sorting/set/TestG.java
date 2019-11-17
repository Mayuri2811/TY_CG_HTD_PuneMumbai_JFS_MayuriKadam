package com.capgemini.sorting.set;

import java.util.TreeSet;

public class TestG {

	public static void main(String[] args) {
TreeSet<Employee1> t= new TreeSet<Employee1>();

Employee1 e1=new Employee1(1, "mayuri",30000);
Employee1 e2=new Employee1(2, "manasi",40000);
Employee1 e3=new Employee1(3, "priyanka",50000);
Employee1 e4=new Employee1(4, "divya",60000);



t.add(e1);
t.add(e2);
t.add(e3);
t.add(e4);

for(Employee1 r:t) {
	System.out.println("Id is: "+r.id);
	System.out.println("name is: "+r.name);
	System.out.println("salary is: "+r.salary);
	System.out.println("----------------------------");
}

	}

}
