package com.capgemini.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="delete from Movie where id=2";
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();

		Query query=entityManager.createQuery(jpql);
		int res= query.executeUpdate();
		System.out.println("Result "+res);

		entityManager.close();
		transaction.commit();

	}

}
