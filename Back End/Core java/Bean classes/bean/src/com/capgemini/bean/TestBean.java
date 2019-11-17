package com.capgemini.bean;

public class TestBean {

	public static void main(String[] args) {
Student s=new Student();
s.setName("Priya");
s.setId(10);
s.setHeight(5.6);
Database db=new Database();
db.receive(s);
	}

}
