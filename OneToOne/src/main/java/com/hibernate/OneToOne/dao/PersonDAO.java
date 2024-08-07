package com.hibernate.OneToOne.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.OneToOne.dto.AadharCard;
import com.hibernate.OneToOne.dto.Person;

public class PersonDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void openConnection() {
		entityManagerFactory=Persistence.createEntityManagerFactory("person");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
	}
	
	public static void closeConnection() {
		if(entityManagerFactory!=null) {
			entityManagerFactory.close();
		}
		if(entityManager!=null) {
			entityManager.close();
		}
		if(entityTransaction!=null) {
			if(entityTransaction.isActive()){
				entityTransaction.rollback();
			}
		}
	}
	
	public static void main(String[] args) {
		
		openConnection();
		entityTransaction.begin();
		
		Person per=new Person();
		per.setId(1);
		per.setName("vaibhav");
		per.setEmail("vaibhav@gmail.com");
		per.setDateOfBirth("08-01-2001");
		
		AadharCard ad=new AadharCard();
		ad.setId(1);
		ad.setAdharNumber(953145689552L);
		ad.setDateOfIssue("01-06-2005");
		per.setAdharCard(ad);
		
		entityManager.persist(ad);
		entityManager.persist(per);
		
		Person person=new Person();
		person.setId(2);
		person.setName("vishal");
		person.setEmail("vishal@gmail.com");
		person.setDateOfBirth("09-05-2008");
		
		AadharCard adhar=new AadharCard();
		adhar.setId(2);
		adhar.setAdharNumber(9565789552L);
		adhar.setDateOfIssue("01-06-2012");
		person.setAdharCard(adhar);
		
		entityManager.persist(adhar);
		entityManager.persist(person);
		
		
		entityTransaction.commit();
		closeConnection();
		
		
		
	}

}
