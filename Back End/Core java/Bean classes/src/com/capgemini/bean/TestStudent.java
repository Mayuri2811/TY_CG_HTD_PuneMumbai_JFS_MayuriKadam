package com.capgemini.bean;

import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		TreeSet<Student> t=new TreeSet<Student>();

		Student s1=new Student();
		s1.setName("Anil");
		s1.setId(1);
		s1.setPercentage(67.97);
		s1.setGender('M');
		
		Student s2=new Student();
		s2.setName("Priya");
		s2.setId(2);
		s2.setPercentage(87.97);
		s2.setGender('F');
		
		Student s3=new Student();
		s3.setName("Arya");
		s3.setId(3);
		s3.setPercentage(57.97);
		s3.setGender('F');
		
		Student s4=new Student();
		s4.setName("Dinesh");
		s4.setId(4);
		s4.setPercentage(77.97);
		s4.setGender('M');
		
		Student s5=new Student();
		s5.setName("Raju");
		s5.setId(5);
		s5.setPercentage(73.97);
		s5.setGender('M');
		
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		
		
		for(Student s:t) {
			System.out.println("Name is: "+s.getName());
			System.out.println("Id is: "+s.getId());
			System.out.println("Percentage is: "+s.getPercentage());
			System.out.println("Gender is: "+s.getGender());
			System.out.println("-----------------------------------------");
		}
	}

}
