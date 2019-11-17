package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reatached {

	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager =entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Movie data=entityManager.find(Movie.class, 2);
			System.out.println(data.getId());
			System.out.println(entityManager.contains(data));
			entityManager.detach(data);
			//entityManager.clear();
			System.out.println(entityManager.contains(data));
			Movie movie1=entityManager.merge(data);
			movie1.setName("ABCD");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}
