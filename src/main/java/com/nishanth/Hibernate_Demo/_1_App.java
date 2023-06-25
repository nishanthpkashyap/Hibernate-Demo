package com.nishanth.Hibernate_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class _1_App 
{
    public static void main( String[] args )
    {
        Alien_1 alien1 = new Alien_1();
        alien1.setId(6);
        alien1.setName("Phoenix");
        alien1.setColour("Blue");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien_1.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction(); 
        session.save(alien1);
        tx.commit();
        
    }
}
