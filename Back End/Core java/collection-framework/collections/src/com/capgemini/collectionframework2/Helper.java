package com.capgemini.collectionframework2;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper {

void display(ArrayList<Student> k) {
	for(Student s: k) {
		System.out.println("Name is: "+s.name);
		System.out.println("Id is: "+s.id);
		System.out.println("Percentage is: "+s.percentage);
		System.out.println("-------------------------------");
	}
		
	}
void onlypass(ArrayList<Student> p) {
	Iterator<Student> it=p.iterator();
	while(it.hasNext()) {
		Student c=it.next();
		if(c.percentage>=35) {
			System.out.println("Name is: "+c.name);
			System.out.println("Id is: "+c.id);
			System.out.println("Percentage is: "+c.percentage);
			System.out.println("-------------------------------");
		}
	}
}
void distinction(ArrayList<Student> j) {
	Iterator<Student> v=j.iterator();
	while(v.hasNext()) {
		Student k=v.next();
		if(k.percentage>=75) {
			System.out.println("Name is: "+k.name);
			System.out.println("Id is: "+k.id);
			System.out.println("Percentage is: "+k.percentage);
			System.out.println("-------------------------------");
		}
	}
}
}

