package com.nishanth.Hibernate_Demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class _13_SQL {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien_1.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session s1 = sf.openSession();
        s1.beginTransaction();
        
//        fetch all columns
//        SQLQuery q = s1.createSQLQuery("select * from Alien_1 where id > 2");
//        q.addEntity(Alien_1.class);
//        List<Alien_1> aliens = (List<Alien_1>) q.list();
//        for(Alien_1 a: aliens) {
//        	System.out.println(a);
//        }
        
//        fetch 2 columns only
        SQLQuery q = s1.createSQLQuery("select id, name from Alien_1 where id > 2");
//        q.addEntity(Alien_1.class);
        List<Object[]> aliens = q.list();
        for(Object[] a: aliens) {
        	System.out.println(a[0] + " " + a[1]);
        }

	}

}
