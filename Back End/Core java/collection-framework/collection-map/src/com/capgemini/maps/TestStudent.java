package com.capgemini.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestStudent {

	public static void main(String[] args) {
LinkedHashMap<String, ArrayList<Student>> hm=new LinkedHashMap<String, ArrayList<Student>>();

ArrayList<Student> al1=new ArrayList<Student>();
Student s1=new Student(1, "Priya", 57.97);
Student s2=new Student(2, "Maya", 67.97);
Student s3=new Student(3, "Saya", 65.65);

al1.add(s1);
al1.add(s2);
al1.add(s3);

ArrayList<Student> al2=new ArrayList<Student>();
Student s4=new Student(4, "Dinesh", 47.97);
Student s5=new Student(5, "Raju", 77.97);

al2.add(s4);
al2.add(s5);

ArrayList<Student> al3=new ArrayList<Student>();
Student s6=new Student(6, "Priyanka", 57.97);
Student s7=new Student(7, "Mayuri", 89.97);
Student s8=new Student(8, "Manasi", 87.97);
Student s9=new Student(9, "Aishwarya", 60.97);

al3.add(s6);
al3.add(s7);
al3.add(s8);
al3.add(s9);

hm.put("First", al1);
hm.put("Second", al2);
hm.put("Third", al3);

ArrayList<Student> al=hm.get("Second");
Iterator<Student> it=al.iterator();
while(it.hasNext()) {
	Student s=it.next();
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("Percentage is "+s.percentage);
	System.out.println("------------------------------------");
}
	}

}
