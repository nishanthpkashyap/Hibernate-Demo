package com.nishanth.Hibernate_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class _7_First_level_cache {

	public static void main(String[] args) {        
		Alien_1 a = null;
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien_1.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        
        //query fired only once 
        Session s1 = sf.openSession();
        s1.beginTransaction(); 
        a = (Alien_1) s1.get(Alien_1.class, 1);
        System.out.println(a);
        a = (Alien_1) s1.get(Alien_1.class, 1); //gets data from 1st lv cache 
        System.out.println(a);
        s1.getTransaction().commit();
        s1.close();
       
        
        //query fired once again because different session
        Session s2 = sf.openSession();
        s2.beginTransaction(); 
        a = (Alien_1) s2.get(Alien_1.class, 1);
        System.out.println(a);
        s2.getTransaction().commit();
        s2.close();

	}

}
