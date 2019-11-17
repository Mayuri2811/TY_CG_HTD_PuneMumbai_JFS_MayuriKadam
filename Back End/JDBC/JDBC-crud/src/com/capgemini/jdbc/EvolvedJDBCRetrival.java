package com.capgemini.jdbc;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCRetrival {

	public static void main(String[] args) {
		FileReader reader=null;
		Properties prop=null;
		
			try {
			 reader=new FileReader("db.properties");
			 prop=new Properties();
			 prop.load(reader);
			 Class.forName(prop.getProperty("dbclass"));
			 System.out.println("Driver loaded..");
			 System.out.println("*********************************");
		} catch (Exception e) {
			e.printStackTrace();
		}
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(prop.getProperty("query"))){
				while(rs.next()) {
					System.out.println("Userid: "+rs.getInt(1));
					System.out.println("User name: "+rs.getString(2));
					System.out.println("Email: "+rs.getString(3));
					System.out.println("------------------------------------");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
	}

}
