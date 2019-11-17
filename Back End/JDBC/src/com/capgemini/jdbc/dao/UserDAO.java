package com.capgemini.jdbc.dao;

import java.util.List;

//import java.util.List;

import com.capgemini.jdbc.beans.UserBean;

public interface UserDAO {
//public List<UserBean> getAllInfo();
public UserBean getInfo(int userid);
public UserBean getLogin(int userid, String password);
public List<UserBean> alluserlist();
}
