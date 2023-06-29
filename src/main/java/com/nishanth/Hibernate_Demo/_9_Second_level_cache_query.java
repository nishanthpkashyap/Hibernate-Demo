package com.nishanth.Hibernate_Demo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class _9_Second_level_cache_query {

	public static void main(String[] args) {
		Alien_8 a = null;
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien_8.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        
        //query fired only once 
        Session s1 = sf.openSession();
        s1.beginTransaction(); 
        Query q1 = s1.createQuery("from Alien_8 where id=2");
        q1.setCacheable(true);
        a = (Alien_8) q1.uniqueResult();
        System.out.println(a);
        s1.getTransaction().commit();
        s1.close();
       
        
        //query fired once again because different session
        Session s2 = sf.openSession();
        s2.beginTransaction(); 
        Query q2 = s2.createQuery("from Alien_8 where id=2");
        q2.setCacheable(true);
        a = (Alien_8) q2.uniqueResult();
        System.out.println(a);
        s2.getTransaction().commit();
        s2.close();

	}

}
