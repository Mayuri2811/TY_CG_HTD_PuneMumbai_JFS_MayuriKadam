package com.capgemini.exception.custom;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
try(Scanner scan=new Scanner(System.in))
		{
System.out.println("Enter the age");
int age=scan.nextInt();
System.out.println("Age is"+age);	//scan.close()
}
	}

}
