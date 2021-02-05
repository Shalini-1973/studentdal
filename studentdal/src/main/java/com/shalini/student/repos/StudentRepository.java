package com.shalini.student.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.shalini.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
