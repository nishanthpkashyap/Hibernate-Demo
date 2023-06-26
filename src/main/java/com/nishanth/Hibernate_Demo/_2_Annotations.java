package com.nishanth.Hibernate_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class _2_Annotations {

	public static void main(String[] args) {
		Alien_2 alien2 = new Alien_2();
        alien2.setId(1);
        alien2.setName("Apple");
        alien2.setColour("Red");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien_2.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction(); 
        session.save(alien2);
        tx.commit();

	}

}
