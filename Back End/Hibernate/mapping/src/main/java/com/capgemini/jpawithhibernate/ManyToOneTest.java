package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.ManyToOne.Pencil;
import com.capgemini.ManyToOne.PencilBox;

public class ManyToOneTest {

	public static void main(String[] args) {
		PencilBox pencilbox=new PencilBox();
		pencilbox.setBoxid(1);
		pencilbox.setName("Camlin");
		
		Pencil pencil=new Pencil();
		pencil.setId(1);
		pencil.setColour("Black");
		pencil.setPencilBox(pencilbox);
		
		Pencil pencil1=new Pencil();
		pencil1.setId(2);
		pencil1.setColour("Red");
		pencil1.setPencilBox(pencilbox);
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		
		
		try {
		 entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager =entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		
		transaction.begin();
		entityManager.persist(pencil);
		entityManager.persist(pencil1);
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
