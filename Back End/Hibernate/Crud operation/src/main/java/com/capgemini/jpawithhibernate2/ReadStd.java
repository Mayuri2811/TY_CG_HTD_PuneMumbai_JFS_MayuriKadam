package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Student;

public class ReadStd {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student data=entityManager.find(Student.class, 1);
		System.out.println(data.getId());
		System.out.println(data.getName());
		System.out.println(data.getPercentage());
		
	
}
}