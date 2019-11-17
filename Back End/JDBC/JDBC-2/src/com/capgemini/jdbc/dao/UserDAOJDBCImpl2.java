package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.capgemini.jdbc.bean.UserBean2;

public class UserDAOJDBCImpl2 implements UserDAO2 {
	Properties prop=null;
	FileReader reader=null;
	UserBean2 user;
		public  UserDAOJDBCImpl2() {
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
		public UserBean2 getInfo(int userid) {
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
		public UserBean2 getInfo(int userid, String password) {
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
					PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("query2"))){
				pstmt.setInt(1, userid);
				pstmt.setString(2, password);
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

		
}
