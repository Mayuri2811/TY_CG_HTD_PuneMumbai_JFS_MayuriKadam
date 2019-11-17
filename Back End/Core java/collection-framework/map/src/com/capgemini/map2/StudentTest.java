package com.capgemini.map2;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
ArrayList<Student> al=new ArrayList<Student>();

Student s1=new Student(1, "Priya", 26.57, 'F');
Student s2=new Student(2, "Maya", 22.37, 'F');
Student s3=new Student(3, "Saya", 56.47, 'F');
Student s4=new Student(4, "Aarti", 77.53, 'F');
Student s5=new Student(5, "Dinesh", 72.67, 'M');
Student s6=new Student(6, "Mahesh", 67.87, 'M');
Student s7=new Student(7, "Suresh", 32.97, 'M');
Student s8=new Student(8, "Ramesh", 65.57, 'M');

al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);
al.add(s5);
al.add(s6);
al.add(s7);
al.add(s8);

HelperStudent h=new HelperStudent();
h.getTopper(al);
//h.displayall(al);
//h.displayPassed(al);
//h.displayFailed(al);
//h.displayPassedByGender(al, 'M');
//h.displayFailedByGender(al, 'F');

	}

}
