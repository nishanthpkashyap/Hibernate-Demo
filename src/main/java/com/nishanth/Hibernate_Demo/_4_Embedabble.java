package com.nishanth.Hibernate_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class _4_Embedabble {

	public static void main(String[] args){
		AlienName name = new AlienName();
		name.setFirst_name("Nishanth");
		name.setMiddle_name("P");
		name.setLast_name("Kashyap");
		
		Alien_4 alien = new Alien_4();
        alien.setId(1);
        alien.setName(name);
        alien.setColour("Red");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien_4.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction(); 
        session.save(alien);
        tx.commit();
	}
}
