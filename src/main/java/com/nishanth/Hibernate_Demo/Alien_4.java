package com.nishanth.Hibernate_Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien_4 {
	@Id
	private int id;
	private AlienName name;
	private String colour;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AlienName getName() {
		return name;
	}
	public void setName(AlienName name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Alien_4 [id=" + id + ", name=" + name + ", colour=" + colour + "]";
	}
	
	
}
