package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UserDAO2;
import com.capgemini.jdbc.dao.UserDAOJDBCImpl2;

public class UserFactory {
	private UserFactory() {
	}
	public static UserDAO2 getInstance() {
		UserDAO2 dao=new UserDAOJDBCImpl2();
		return dao;
	}
}
