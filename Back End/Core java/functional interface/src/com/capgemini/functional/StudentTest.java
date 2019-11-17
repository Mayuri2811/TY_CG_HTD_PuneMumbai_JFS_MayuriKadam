package com.capgemini.functional;

import java.util.function.Predicate;

public class StudentTest {

	public static void main(String[] args) {
Student s1=new Student(1, 67.97);
Student s2=new Student(2, 32.97);
Predicate<Student> p=k->{
	if(k.percentage>=35) {
		return true;
	}else {
		return false;
	}
};
boolean res=p.test(s2);
System.out.println("Result is: "+res);
	}

}
