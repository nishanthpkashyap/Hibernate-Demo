package com.nishanth.Hibernate_Demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class _11_HQL_1 {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien_1.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session s1 = sf.openSession();
        s1.beginTransaction();
        
//        *****For more than 1 row*******
//        Query q = s1.createQuery("from Alien_1");
//        List<Alien_1> aliens = q.list();
//        for(Alien_1 a: aliens) {
//        	System.out.println(a);
//        }
        
//        *****For 1 row*****
        Query q = s1.createQuery("from Alien_1 where id=3");
        Alien_1 a = (Alien_1)q.uniqueResult();
        System.out.println(a);
        s1.getTransaction().commit();
        s1.close();

	}

}
