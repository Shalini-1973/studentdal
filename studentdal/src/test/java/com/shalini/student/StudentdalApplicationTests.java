package com.shalini.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shalini.student.entities.Student;
import com.shalini.student.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	/*@Autowired
    private   StudentRepository repo;
	@Test
	void testCreateStudent() {
		Student entity = new Student();
		entity.setName("Komal");
		entity.setCourse("wordpress");
		entity.setFee(30d);
		repo.save(entity);
	}
    @Test
    void testFindStudentById() {
    	Student student = repo.findById(2l).get();
    	System.out.println(student);
    }
    @Test
    void testUpdateStudent(){
    	Student student = repo.findById(1l).get();
    	student.setName("suchi");
    	repo.save(student);
    	
    }
    @Test
    void testDeleteStudent() {
    	Student student = repo.findById(1l).get();
    	repo.delete(student);
    }*/
}
