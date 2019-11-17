package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
Student s1=new Student(1, "Ramesh",56.65 );
Student s2=new Student(2, "Suresh", 76.74);
Student s3=new Student(3, "Mahesh", 79.62);
Student s4=new Student(4, "Mangesh", 89.82);
Student s5=new Student(5, "Jignesh",67.37);

ArrayList<Student> al=new ArrayList<Student>();
al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);
al.add(s5);


for(int i=0;i<5;i++) {
	Student s= al.get(i);
	System.out.println("Id is: "+s.id);
	System.out.println("Name is: "+s.name);
	System.out.println("Percentage is: "+s.percentage);
	System.out.println("-------------------------------");
}

	}

}
