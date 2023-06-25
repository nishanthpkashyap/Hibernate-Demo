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
        _1_Alien alien1 = new _1_Alien();
        alien1.setId(4);
        alien1.setName("Ton 618");
        alien1.setColour("Black");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(_1_Alien.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction(); 
        session.save(alien1);
        tx.commit();
        
    }
}
