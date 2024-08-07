package com.hibernate.CarDekho_Hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="car_details")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int car_id;
	private String name;
	private String brand;
	private String fuel_type;
	private double price;

}
