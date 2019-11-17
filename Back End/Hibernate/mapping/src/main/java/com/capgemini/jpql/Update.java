package com.capgemini.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Update {

	public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
EntityManager entityManager=entityManagerFactory.createEntityManager();
String jpql="update Movie set name='ABCD2' where id=2";
EntityTransaction transaction=entityManager.getTransaction();
transaction.begin();

Query query=entityManager.createQuery(jpql);
int res= query.executeUpdate();
System.out.println("Result "+res);

entityManager.close();
transaction.commit();

	}

}
