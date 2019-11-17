package com.capgemini.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.ManyToMany.Course;
import com.capgemini.ManyToMany.Student;

public class ManyToManyTest {

	public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=null;
EntityManager entityManager=null;
EntityTransaction transaction=null;

Course course=new Course();
course.setCid(1);
course.setCname("Java");

Course course1=new Course();
course.setCid(3);
course.setCname("SQL");

ArrayList<Course> al=new ArrayList<Course>();
al.add(course);
al.add(course1);

Student student=new Student();
student.setSid(1);
student.setSname("Dinesh");
student.setCourse(al);



try {
	entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	entityManager=entityManagerFactory.createEntityManager();
	transaction=entityManager.getTransaction();
	transaction.begin();
	//entityManager.persist(student);
	Course course2=entityManager.find(Course.class, 3);
	System.out.println("Record saved");
	transaction.commit();
}
catch(Exception e) {
	e.printStackTrace();
	transaction.rollback();
}
entityManager.close();
	}

}
