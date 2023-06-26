package com.nishanth.Hibernate_Demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Laptop_5 
{
	@Id
	private int id;
	private String name;
	@ManyToMany
	private List<Student_5> student = new ArrayList<Student_5>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student_5> getStudent() {
		return student;
	}
	public void setStudents(List<Student_5> students) {
		this.student = students;
	}
}
