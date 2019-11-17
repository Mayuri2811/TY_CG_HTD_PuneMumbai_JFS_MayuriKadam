package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.jdbc.beans.UserBean;

public class UserDAOJDBCImpl implements UserDAO {
Properties prop=null;
FileReader reader=null;
Statement stmt=null;
UserBean user;

	public  UserDAOJDBCImpl() {
		PreparedStatement pstmt=null;
		try {
			reader=new FileReader("db.properties");
			 prop=new Properties();
			 prop.load(reader);
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public UserBean getInfo(int userid) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("query1"))){
			pstmt.setInt(1, userid);
			try(ResultSet rs=pstmt.executeQuery()){
				if(rs.next()) {
					 user.setUserid(rs.getInt(1));
					 user.setUsername(rs.getString(2));
					 user.setEmail(rs.getString(3));
				}return user;
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		return null;
		}

	@Override
	public UserBean getLogin(int userid, String password) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("query2"))){
			pstmt.setInt(1, userid);
			pstmt.setString(2, password);
			try(ResultSet rs=pstmt.executeQuery()){
				if(rs.next()) {
					user=new UserBean();
					 user.setUserid(rs.getInt(1));
					 user.setUsername(rs.getString(2));
					 user.setEmail(rs.getString(3));
				}return user;
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public List<UserBean> alluserlist() {
		List<UserBean> userlist=new ArrayList<UserBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query"))){
			
			
				while(rs.next()) {
					user=new UserBean();
					
					 user.setUserid(rs.getInt(1));
					 user.setUsername(rs.getString(2));
					 user.setEmail(rs.getString(3));
					 userlist.add(user);
					 
				}return userlist;
			
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	}


