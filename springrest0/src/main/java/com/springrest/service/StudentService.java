package com.springrest.service;

import java.util.List;

import com.springrest.POJO.StudentPOJO;
import com.springrest.repository.StudentRepository;

public class StudentService {
	
	private StudentRepository repository;

	public StudentPOJO addStudent(StudentPOJO pojo) {

		StudentPOJO student = repository.addStudent(pojo);
		return student;
	}
	
	public StudentPOJO searchStudent(int id) {
		StudentPOJO student = repository.searchStudent(id);
		return student;
	}

	public List<StudentPOJO> searchAllStudent() {
		List<StudentPOJO> students = repository.searchAllStudents();
		return students;
	}

	public StudentPOJO removeStudent(int id) {
		StudentPOJO student = repository.removeStudent(id);
		return student;
	}

	public StudentPOJO updateStudent(StudentPOJO pojo) {
		StudentPOJO student = repository.updateStudent(pojo);
		return student;
	}


}
