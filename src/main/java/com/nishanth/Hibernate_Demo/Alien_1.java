package com.nishanth.Hibernate_Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien_1 
{
	@Id
	private int id;
	private String name;
	private String colour;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
}
