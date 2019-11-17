package com.capgemini.assignment;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	double percentage;

	Scanner scan=new Scanner(System.in);

	void add() {
		System.out.println("Enter id:");
		id=scan.nextInt();

		System.out.println("Enter name:");
		name=scan.next();

		System.out.println("Enter percentage:");
		percentage=scan.nextDouble();
	}

	void display() {
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Percentage is: "+percentage);
	}
}
