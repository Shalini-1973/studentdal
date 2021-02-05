package com.shalini.student.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mystudent")
public class Student implements Serializable {
	@Id
	private Long id;
	@Column(name="sname")
	private String name;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Student() {};

}
