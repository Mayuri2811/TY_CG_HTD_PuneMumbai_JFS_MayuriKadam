package com.capgemini.collectionframework2;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args) {
		
	
	Student t1=new Student(1, "Ramesh",56.65 );
	Student t2=new Student(2, "Suresh", 76.74);
	Student t3=new Student(3, "Mahesh", 79.62);
	Student t4=new Student(4, "Mangesh", 89.82);
	Student t5=new Student(5, "Jignesh",67.37);

	ArrayList<Student> al=new ArrayList<Student>();
al.add(t1);
al.add(t2);
al.add(t3);
al.add(t4);
al.add(t5);

Helper h=new Helper();
h.display(al);
h.onlypass(al);
h.distinction(al);
	}
}
