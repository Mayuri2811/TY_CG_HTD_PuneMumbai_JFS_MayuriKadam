package com.capgemini.array.genric;

public class TestStudent {

	public static void main(String[] args) {
Student[] st= new Student[4];
Student s1=new Student(1,"Divya",75.75);
Student s2=new Student(2,"manasi",56.56);
Student s3=new Student(3,"priyanka",66.66);
Student s4=new Student(4,"aishwarya",62.62);
st[0]=s1;
st[1]=s2;
st[2]=s3;
st[3]=s4;
receive(st);
	}
static void receive(Student[] a) {
	for(Student i:a) {
		System.out.println(i.id);
		System.out.println(i.name);
		System.out.println(i.percentage);
		System.out.println("------------------");
	}
}
}
