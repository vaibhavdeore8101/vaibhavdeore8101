package com.springrest.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.springrest.POJO.AdminPOJO;

@Repository
public class AdminRepository {
	
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openconnection() {
		factory=Persistence.createEntityManagerFactory("REST");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
		
	}
	
	private static void closeconnection() {
		if(factory != null) {
			factory.close();
		}
		
		if(manager != null) {
			manager.close();
		}
		
		if(transaction != null) {
			if(transaction.isActive()) {
				transaction.rollback();
			}
		}
	}

	public AdminPOJO CreateAccount(AdminPOJO pojo) {
		openconnection();
		transaction.begin();
		
		manager.persist(pojo);
		transaction.commit();
		closeconnection();
		return pojo;
	}

	public AdminPOJO login(AdminPOJO pojo) {
			openconnection();
			transaction.begin();
			
			AdminPOJO admin = manager.find(AdminPOJO.class, pojo.getUserName());
			if (admin != null) {
				if (admin.getPassWord().equals(pojo.getPassWord())) {
					transaction.commit();
					closeconnection();
					return admin;
				}
			}
			transaction.commit();
			closeconnection();
			return null;
	}
	
	

}
