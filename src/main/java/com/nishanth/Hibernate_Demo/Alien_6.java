package com.nishanth.Hibernate_Demo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alien_6 {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "alien", fetch = FetchType.EAGER)
	private List<Laptop_6> laptops = new ArrayList<Laptop_6>();
	
	
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
	public List<Laptop_6> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop_6> laptops) {
		this.laptops = laptops;
	}
	@Override
	public String toString() {
		return "Alien_6 [id=" + id + ", name=" + name + ", laptops=" + laptops + "]";
	}
}
