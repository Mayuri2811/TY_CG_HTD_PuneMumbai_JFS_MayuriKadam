package com.capgemini.assignment;

import java.util.Scanner;



public class TestStudent {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Student s=new Student();
		while(true) {
			System.out.println("Enter your choice");
			System.out.println("1:add details");
			System.out.println("2:display details");
			System.out.println("3:exit");

			int ch=scan.nextInt();
			switch(ch) {
			case 1:s.add();
			break;
			case 2:s.display();
			break;
			case 3:System.exit(0);
			default:System.out.println("Invalid choice");
			}
		}
	}

}
