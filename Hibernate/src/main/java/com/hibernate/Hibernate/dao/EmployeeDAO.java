package com.hibernate.Hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Hibernate.dto.EmployeeDTO;

public class EmployeeDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openconnetion() {
		entityManagerFactory=Persistence.createEntityManagerFactory("Employee");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		
	}
	
	private static void closeconnection() {
		if(entityManagerFactory!=null) {
			entityManagerFactory.close();
		}
		if(entityManager != null) {
			entityManager.close();
		}
		if(entityTransaction != null) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
	
	public static void main(String[] args) {
		
		openconnetion();
		entityTransaction.begin();
		
		
		EmployeeDTO emp=new EmployeeDTO();
		emp.setId(1);
		emp.setName("vaibhav");
		emp.setEmail("vaibhavdeore@gmail.com");
		emp.setContact(8888218709L);
		emp.setAddress("Pune");
		
		entityManager.persist(emp);
		
		entityTransaction.commit();
		closeconnection();
		
	}

}
