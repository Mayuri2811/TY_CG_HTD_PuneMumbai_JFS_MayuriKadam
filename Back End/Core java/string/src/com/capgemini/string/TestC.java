package com.capgemini.string;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestC {

	public static void main(String[] args) {
		Comparator<Employee> comp=(e1,e2)->e1.name.compareTo(e2.name);
		
		TreeSet<Employee> ts=new TreeSet<Employee>(comp);

		Employee e1= new Employee(1, "Priya", 5.6);
		Employee e2= new Employee(2, "Dinesh", 5.4);
		Employee e3= new Employee(3, "Raju", 5.3);
		Employee e4= new Employee(4, "Smita", 5.5);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		Iterator<Employee> it= ts.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println("Id is: "+e.id);
			System.out.println("Name is: "+e.name);
			System.out.println("Height is:"+e.height);
			System.out.println("----------------------------");
		}
	}

}
