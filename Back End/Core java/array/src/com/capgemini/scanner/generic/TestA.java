package com.capgemini.scanner.generic;
import java.util.Scanner;

public class TestA {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the name");
	String name= scan.nextLine();
	System.out.println("Enter the age");
	int age=scan.nextInt();
	System.out.println("Enter the height");
	double height=scan.nextDouble();
	scan.close();
}
}
