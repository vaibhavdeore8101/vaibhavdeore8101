package com.springrest.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.springrest.POJO.StudentPOJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentResponse {
	
	private String msg;
	private StudentPOJO student;
	private List<StudentPOJO> students;


}
