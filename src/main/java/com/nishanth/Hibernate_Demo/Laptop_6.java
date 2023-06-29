package com.nishanth.Hibernate_Demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop_6 {

	@Id
	private int id;
	private String name;
	@ManyToOne
	private Alien_6 alien;
	
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
	public Alien_6 getAlien() {
		return alien;
	}
	public void setAlien(Alien_6 alien) {
		this.alien = alien;
	}
	
	@Override
	public String toString() {
		return "Laptop_6 [id=" + id + ", name=" + name + ", alien=" + alien.getName() + "]";
	}
	
	

}
