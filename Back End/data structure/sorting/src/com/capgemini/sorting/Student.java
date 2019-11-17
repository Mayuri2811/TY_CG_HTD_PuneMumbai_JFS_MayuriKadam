package com.capgemini.sorting;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	//Logic to sort student by ID
	/*
	 * @Override public int compareTo(Student s) { if(this.id>s.id) { return 1;
	 * }else if (this.id<s.id){ return -1; }else { return 0; } }
	 */
	
	//Sorting using boxing
	@Override
	public int compareTo(Student s) {
		Double k=this.percentage;
		Double t=s.percentage;
		return k.compareTo(t);
	}
	
	//Logic to sort in dec order
	/*
	 * @Override public int compareTo(Student s) { return
	 * this.name.compareTo(s.name)*-1; }
	 */
	
	//Logic1 to sort student by name
	/*
	 * @Override public int compareTo(Student s) { return
	 * this.name.compareTo(s.name); }
	 */
	
	//Logic2 to sort student by name
	/*
	 * @Override public int compareTo(Student s) { String k=this.name; String
	 * t=s.name;
	 * 
	 * int res=k.compareTo(t); return res; }
	 */

	//Logic to sort student by percentage
	/*
	 * @Override public int compareTo(Student s) { if(this.percentage>s.percentage)
	 * { return 1; }else if(this.percentage<s.percentage) { return -1; }else {
	 * return 0; } }
	 */

	

	
}
