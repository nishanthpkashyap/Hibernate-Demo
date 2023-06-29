package com.nishanth.Hibernate_Demo;

import java.util.Collection;
import java.util.Collections;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class _6_Fetch_Eager_Lazy {

	public static void main(String[] args) 
	{
//		Laptop_6 l1 = new Laptop_6();
//		Laptop_6 l2 = new Laptop_6();
//		
//		l1.setName("HP");
//		l2.setName("OMEN");
//		l1.setId(1);
//		l2.setId(2);
//		
//		Alien_6 alien = new Alien_6();
//		alien.setId(1);
//		alien.setName("Nish");
//		alien.getLaptops().add(l1);
//		alien.getLaptops().add(l2);
//		
//		l1.setAlien(alien);
//		l2.setAlien(alien);
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien_6.class).addAnnotatedClass(Laptop_6.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction(); 
        
        Alien_6 alien = (Alien_6) session.get(Alien_6.class, 1);
        System.out.println(alien.getName());
        
        //lazy fetching
//        Collection<Laptop_6> laptop = alien.getLaptops();
//        for(Laptop_6 l: laptop) {
//        	System.out.println(l);
//        }
       
        tx.commit();
	}

}
