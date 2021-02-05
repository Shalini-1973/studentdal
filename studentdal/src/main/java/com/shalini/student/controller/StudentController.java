package com.shalini.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shalini.student.entities.Student;
import com.shalini.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	@GetMapping("/searchStudent/{id}")
	public Student getStudent(@PathVariable("id") Long id) {
		return service.getStudent(id);
}
	@GetMapping("/deleteStudent/{id}")
	public List<Student>  deleteStudent(@PathVariable("id") Long id){
		return service.deleteStudent(id);
	}
	@PostMapping("/update")
	public String updateStudent(@RequestBody Student student){
    	Student st1= service.getStudent(student.getId());
    	st1.setName(student.getName());
    	return service.saveStudent(st1);
	}
}