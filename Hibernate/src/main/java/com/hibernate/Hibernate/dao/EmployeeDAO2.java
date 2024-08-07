package com.hibernate.Hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Hibernate.dto.EmployeeDTO;

public class EmployeeDAO2 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void openconnection() {
		entityManagerFactory=Persistence.createEntityManagerFactory("Employee");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		
	}
	
	public static void closeConnection() {
		if(entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if(entityManager != null) {
			entityManager.clear();
		}
		if(entityTransaction != null) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
	
	public static void main(String[] args) {
		
		openconnection();
		entityTransaction.begin();
		
		EmployeeDTO emp=entityManager.find(EmployeeDTO.class, 2);
		System.out.println(emp);
		
		entityTransaction.commit();
		closeConnection();
	}

}
