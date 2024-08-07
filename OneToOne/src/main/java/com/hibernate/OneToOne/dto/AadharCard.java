package com.hibernate.OneToOne.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AadharCard {
	@Id
	private int id;
	private long adharNumber;
	private String DateOfIssue;

}
