package com.capgemini.jdbc.dao;


import com.capgemini.jdbc.bean.UserBean2;

//import java.util.List;


public interface UserDAO2 {
	//public List<UserBean> getAllInfo();
	public UserBean2 getInfo(int userid);
	public UserBean2 getInfo(int userid,String password);
}
