package com.nishanth.Hibernate_Demo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student_5 {
	@Id
	private int id;
	private String name;
	@ManyToMany(mappedBy = "student")
	private List<Laptop_5> laptop = new ArrayList<Laptop_5>(); 
	
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
	public List<Laptop_5> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop_5> laptop) {
		this.laptop = laptop;
	}
	
}
