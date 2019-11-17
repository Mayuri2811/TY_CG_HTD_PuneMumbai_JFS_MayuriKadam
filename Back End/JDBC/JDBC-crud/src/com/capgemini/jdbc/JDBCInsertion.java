package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertion {

	public static void main(String[] args) {
Connection conn=null;
Statement stmt=null;
		try {
			
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded..");
			System.out.println("-------------------");
			
			//Get the connection 
			String dbUrl ="jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("Connection Established..");
			System.out.println("---------------------");
			
			//Issue SQL query via connection
			String query="INSERT INTO users_info values(2019005,'Peter parker','p.parker@avengers.com','maryjane')";
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(query);
			//Process the Results
			if(count>0) {
				System.out.println("Data inserted..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
