package com.capgemini.bean;

import java.util.Comparator;

public class StudentByPercentage implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Double k=o1.getPercentage();
		Double m=o2.getPercentage();
		return k.compareTo(m);
	}

}
