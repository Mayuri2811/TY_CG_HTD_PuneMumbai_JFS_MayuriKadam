package com.capgemini.bean;

import java.util.Comparator;

public class StudentByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
String k=o1.getName();
String m=o2.getName();
		return k.compareTo(m);
	}

}
