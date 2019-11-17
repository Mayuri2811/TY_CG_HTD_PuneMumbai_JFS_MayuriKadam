package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDeletion {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		try {

			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded..");
			System.out.println("-------------------");

			//Get the connection 
			String dbUrl ="jdbc:mysql://localhost:3306/capg_db";

			System.out.println("Enter the username and password");
			String user=sc.nextLine();
			String password=sc.nextLine();

			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("Connection Established..");
			System.out.println("---------------------");

			//Issue SQL query via connection
			String query="DELETE from users_info where userid= ? ";

			pstmt=conn.prepareStatement(query);
			
			/*
			 * System.out.println("Enter new username:"); pstmt.setString(1,sc.nextLine());
			 */
			System.out.println("Enter userid:");
			pstmt.setInt(1,sc.nextInt() );

			
			/*
			 * System.out.println("Enter email:"); pstmt.setString(3, sc.nextLine());
			 * 
			 * System.out.println("Enter password:"); pstmt.setString(4, sc.nextLine());
			 */


			int count=pstmt.executeUpdate();

			//Process the Results
			if(count>0) {
				System.out.println("Data Deleted..");
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
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			sc.close();
		}

	}
}
