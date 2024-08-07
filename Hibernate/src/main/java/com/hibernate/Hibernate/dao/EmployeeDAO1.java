package com.hibernate.Hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Hibernate.dto.EmployeeDTO;

public class EmployeeDAO1 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void openconnection() {
		entityManagerFactory=Persistence.createEntityManagerFactory("Employee");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		}
	
	public static void closeConnection() {
		if(entityManagerFactory !=null) {
			entityManagerFactory.close();
		}
		if(entityManager !=null) {
			entityManager.close();
		}
		if(entityTransaction !=null) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
	
	public static void main(String[] args) {
		
		openconnection();
		entityTransaction.begin();
		
		EmployeeDTO emp1=new EmployeeDTO();
		emp1.setId(2);
		emp1.setName("Vishal");
		emp1.setAddress("Old Sanghvi");
		emp1.setContact(1234567890L);
		emp1.setEmail("vishal@gmail.com");
		
		entityManager.persist(emp1);
		
		EmployeeDTO emp2=new EmployeeDTO();
		emp2.setId(3);
		emp2.setName("Tushar");
		emp2.setAddress("Shitole Nagar");
		emp2.setContact(9876543214L);
		emp2.setEmail("tushar@gmail.com");
		
		entityManager.persist(emp2);
		
		entityTransaction.commit();
		
		closeConnection();
	}

}
