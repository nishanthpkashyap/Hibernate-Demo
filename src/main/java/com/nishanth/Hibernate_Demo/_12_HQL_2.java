package com.nishanth.Hibernate_Demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class _12_HQL_2 {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien_1.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session s1 = sf.openSession();
        s1.beginTransaction();
        
        int id = 2;
        
//        fetch multiple rows
        Query q = s1.createQuery("select id, name from Alien_1 where id > :id");
        q.setParameter("id", id);
        List<Object[]> aliens = (List<Object[]>) q.list();
        for(Object[] a: aliens) {
        	System.out.println(a[0] + " " + a[1]);
        }
        
//        fetch single row 
//        Query q = s1.createQuery("select id, name from Alien_1 where id=2");
//        Object[] a = (Object[])q.uniqueResult();
//        System.out.println(a[0] + " "+ a[1]);
        
//        Fetch sum of id
//        Query q = s1.createQuery("select sum(id) from Alien_1");
//        Object sum = (Object) q.uniqueResult();
//        System.out.println(sum);
        
        
        s1.close();

	}

}
