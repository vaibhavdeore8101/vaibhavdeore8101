package com.SpringCore.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonBean {
	int id;
	String name;
	AadharBean aadhar;

}
