package com.capgemini.jdbc;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCRetrivalAll {

	public static void main(String[] args) {
Connection conn=null;
FileReader reader=null;
Properties prop=null;
Statement stmt=null;
ResultSet rs=null;
try {
	reader = new FileReader( "C:\\Users\\Admin\\Desktop\\db.properties");
	 prop=new Properties();
	prop.load(reader);
} catch (Exception e) {
	e.printStackTrace();
}


try {
	//Load the Driver
	java.sql.Driver driver=new com.mysql.jdbc.Driver();
	DriverManager.registerDriver(driver);
	System.out.println("Driver loaded..");
	System.out.println("----------------------");

	//Get the connection
	String dbUrl="jdbc:mysql://localhost:3306/capg_db";
	conn=DriverManager.getConnection(dbUrl, prop);
	System.out.println("Connection Estd....");
	System.out.println("***********************************************");
	
	//Issue SQL query via connection
	String query="select*from users_info";
	stmt=conn.createStatement();
	rs=stmt.executeQuery(query);
	
	//process the result
	
	while(rs.next()) {
		System.out.println("User Id:"+rs.getInt("userid"));
		System.out.println("User Name:"+rs.getString("username"));
		System.out.println("Email:"+rs.getString("email"));
		System.out.println("Password:"+rs.getString("password"));
		System.out.println("----------------------------------");


	}
	
} catch (SQLException e) {
	e.printStackTrace();
}
finally {
	if(conn!=null) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	if(rs!=null) {
		try {
			rs.close();
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
	
	if(reader!=null) {
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


	}

}
