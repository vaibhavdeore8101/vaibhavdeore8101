package com.springrest.POJO;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AdminPOJO {
	@Id
	private String UserName;
	private String PassWord;

}
