package com.hibernate.client;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.dto.Ticket;

public class TicketMain1 {

	public static void main(String[] args) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources x = new MetadataSources(registry);
		Metadata data = x.getMetadataBuilder().build();
		SessionFactory factory = data.getSessionFactoryBuilder().build();
		Session ssn = factory.openSession(); // this will get a connection to the db
	    Transaction t = ssn.beginTransaction();
	    
	    Ticket t1 = new Ticket("customer2", "singapore","chennai");
	    
	    ssn.save(t1);
	    t.commit();
	    System.out.println("Record Added");

	}

}
