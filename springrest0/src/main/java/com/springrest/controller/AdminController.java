package com.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.POJO.AdminPOJO;
import com.springrest.response.AdminResponse;
import com.springrest.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@PostMapping(path="/CreateAccount", consumes = MediaType.APPLICATION_JSON_VALUE,
			                           produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminResponse>  CreateAccount(@RequestBody AdminPOJO pojo) {
		AdminPOJO admin=service.CreateAccount(pojo);
		//SUCCESS
				if (admin != null) {
					return new ResponseEntity<AdminResponse>(new AdminResponse("Account created succesfully. ", admin), HttpStatus.ACCEPTED);
				}
				
				//FAILURE
				return new ResponseEntity<AdminResponse>(new AdminResponse("Account not created. ", null), HttpStatus.NOT_ACCEPTABLE);
		
	}
	
	
	
	@PostMapping(path = "/login",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminResponse> login(@RequestBody AdminPOJO pojo){
		AdminPOJO admin = service.login(pojo);
		
		//SUCCESS
		if (admin != null) {
			return new ResponseEntity<AdminResponse>(new AdminResponse("Login successful. ", admin), HttpStatus.OK);
		}
		
		//FAILURE
		return new ResponseEntity<AdminResponse>(new AdminResponse("Login failed. ", null), HttpStatus.NOT_FOUND);
	}
	

}
