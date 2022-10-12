package com.hibernate.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.dto.Ticket;

public class TicketMain2 {

	public static void main(String[] args) {
		
//	addRecord();
//	findRecord();
		
  
	   
	}
	
	public static EntityManager getEntityManager() {

	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
	    EntityManager em = emf.createEntityManager();
	    return em;
		
	}
	
	public static void addRecord() {
		EntityManager em = getEntityManager();
	    EntityTransaction et = em.getTransaction();
	    Ticket t1 = new Ticket("customer3", "singapore","chennai");
	    
	    et.begin();
	    em.persist(t1);
	    et.commit();
		
		 System.out.println("Record Added");
	}

	public static void findRecord() {
		
		EntityManager em = getEntityManager();
	    EntityTransaction et = em.getTransaction();
	    
	    et.begin();
		Ticket temp = em.find(Ticket.class, 3);
		et.commit();
		   System.out.println(temp);
		
	}
	
public static void updateRecordById() {
		
		EntityManager em = getEntityManager();
	    EntityTransaction et = em.getTransaction();
	    
	    et.begin();
		Ticket temp = em.find(Ticket.class, 4);
		temp.setCustomerName("new name");
		em.persist(temp);
		et.commit();
		   System.out.println(temp);
		
	}

public static void deleteById(int id) {
	
	EntityManager em = getEntityManager();
    EntityTransaction et = em.getTransaction();
    
    et.begin();
	Ticket temp = em.find(Ticket.class,id);
	em.remove(temp);
	et.commit();
	System.out.println(temp);
	
}
	

}
