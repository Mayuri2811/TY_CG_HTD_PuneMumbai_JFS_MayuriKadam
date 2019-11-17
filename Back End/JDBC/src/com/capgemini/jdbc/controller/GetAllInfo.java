package com.capgemini.jdbc.controller;

import java.util.List;

import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class GetAllInfo {
public static void main(String[] args) {
	UserDAO dao=UserFactory.getInstance();
	List<UserBean> userlist =dao.alluserlist();
	if(userlist!=null) {
		for(UserBean user:userlist) {
			System.out.println(user);
		}
	}else {
		System.out.println("Something went wrong..");
	}
}
}
