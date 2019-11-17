package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Student;

public class UpdateStd {

	public static void main(String[] args) {
EntityManager entityManager=null;
EntityTransaction transaction=null;

try {
	EntityManagerFactory entityManagerfactory=Persistence.createEntityManagerFactory("TestPersistence");
	entityManager=entityManagerfactory.createEntityManager();
	transaction=entityManager.getTransaction();
	transaction.begin();
	Student data=entityManager.find(Student.class,2);
	data.setName("Dinesh");
	System.out.println("Record updated..");
	transaction.commit();
}catch(Exception e) {
	transaction.rollback();
	e.printStackTrace();
}entityManager.close();
	}

}
