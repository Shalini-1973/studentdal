package com.shalini.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shalini.student.entities.Student;
import com.shalini.student.repos.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	public String saveStudent(Student student) {
		
	repository.save(student);
	return "student save by id"+student.getId();

}
public Student getStudent(Long id) {
	return repository.findById(id).get();
}
public List<Student> deleteStudent(Long id){
	repository.deleteById(id);
	return repository.findAll();
}
}
