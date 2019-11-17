package com.capgemini.functional;

import java.util.function.Consumer;

public class TestE {

	public static void main(String[] args) {
Consumer<Student> c=(s)->{
	System.out.println("Id is "+s.id);
	System.out.println("Percentage is "+s.percentage);
	
};

Student s1=new Student(3, 55.54);
c.accept(s1);
	}

}
