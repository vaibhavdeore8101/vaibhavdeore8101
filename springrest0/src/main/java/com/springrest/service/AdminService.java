package com.springrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.POJO.AdminPOJO;
import com.springrest.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repository;
	
	public AdminPOJO CreateAccount(AdminPOJO pojo) {
		AdminPOJO admin=repository.CreateAccount(pojo);
		return admin;
	}

	public AdminPOJO login(AdminPOJO pojo) {
		AdminPOJO admin = repository.login(pojo);
		return admin;
	}

}
