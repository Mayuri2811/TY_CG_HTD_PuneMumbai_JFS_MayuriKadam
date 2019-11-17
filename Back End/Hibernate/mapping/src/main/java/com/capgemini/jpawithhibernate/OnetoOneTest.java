package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.OnetoOne.Person;
import com.capgemini.OnetoOne.VoterCard;


public class OnetoOneTest {

	public static void main(String[] args) {
		Person person=new Person();
		person.setId(3);
		person.setName("Ramesh");
		
		VoterCard votercard=new VoterCard();
		votercard.setVid(1234);
		votercard.setAddress("P.M nagar");
		
		person.setVotercard(votercard);
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		
		try {
		 entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager =entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		
		VoterCard v2=entityManager.find(VoterCard.class,1234);
		System.out.println(v2.getVid());
		System.out.println(v2.getAddress());
		System.out.println(v2.getPerson().getId());
		System.out.println(v2.getPerson().getName());
		
		
		//entityManager.persist(person);
		System.out.println("Record saved");
		transaction.commit();
		}
		catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}
