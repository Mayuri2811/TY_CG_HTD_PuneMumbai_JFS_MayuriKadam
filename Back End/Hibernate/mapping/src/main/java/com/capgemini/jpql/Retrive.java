package com.capgemini.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrive {

	public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
EntityManager entityManager=entityManagerFactory.createEntityManager();
String jpql="from Movie";
Query query=entityManager.createQuery(jpql);
List<Movie> list=query.getResultList();
for(Movie m:list) {
	System.out.println("id is "+m.getId());
	System.out.println("name is "+m.getName());
	System.out.println("rating is "+m.getRatings());
	System.out.println("--------------------------------");
}
entityManager.close();
	}

}
