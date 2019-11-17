package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean2;

import com.capgemini.jdbc.dao.UserDAO2;
import com.capgemini.jdbc.factory.UserFactory;

public class GetInfo2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	UserDAO2 dao=UserFactory.getInstance();
		/*
		 * System.out.println("Enter the userid.."); UserBean2
		 * user=dao.getInfo(sc.nextInt());
		 */
	
	System.out.println("Enter the id and password");
	UserBean2 user1=dao.getInfo(sc.nextInt(),sc.nextLine());
	if(user1!=null) {
		System.out.println(user1);
	}else {
		System.out.println("Something went wrong....");
	}
	sc.close();
		}

}

