package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Student;

public class DeleteStd {
	 
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		try {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
  entityManager=entityManagerFactory.createEntityManager();
  transaction=entityManager.getTransaction();
  transaction.begin();
  Student data=entityManager.find(Student.class, 1);
  entityManager.remove(data);
  System.out.println("Record deleted..");
  transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}entityManager.close();
	}

}
