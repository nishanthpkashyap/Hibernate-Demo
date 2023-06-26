package com.nishanth.Hibernate_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class _5_Mapping_Relations {

	public static void main(String[] args) {
		Laptop_5 laptop = new Laptop_5();
		laptop.setId(1);
		laptop.setName("OMEN");
		
		Student_5 student = new Student_5();
		student.setId(1);
		student.setName("Hippo");
		student.getLaptop().add(laptop);
		
		laptop.getStudent().add(student); //for @ManyToMany only
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student_5.class).addAnnotatedClass(Laptop_5.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction(); 
        session.save(student);
        session.save(laptop);
        tx.commit();

	}

}
