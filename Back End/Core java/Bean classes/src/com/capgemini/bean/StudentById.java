package com.capgemini.bean;

import java.util.Comparator;

public class StudentById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Integer k=o1.getId();
		Integer m= o2.getId();
		
		return k.compareTo(m);
	}

}
