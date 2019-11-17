package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reference {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie data=entityManager.getReference(Movie.class, 4);
		System.out.println(data.getClass());
		/*
		 * System.out.println("ID--"+data.getId());
		 * System.out.println("Name is--"+data.getName());
		 * System.out.println("Rating is--"+data.getRatings());
		 */
	}

}
