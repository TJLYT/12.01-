package com.example;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertEmp {

	public static void main(String[] args) {
		
		
		EntityManagerFactory e = Persistence.createEntityManagerFactory("JPA");
		EntityManager  entityManager = e.createEntityManager();
		   entityManager.getTransaction().begin();
	/*	Org org=new Org();
		org=entityManager.createQuery(
				"Select o from Org o where o.id=1? and o.name=?2",Org.class)
				.setParameter(1, id)
				.setParameter(2, name)
				.setSingleResult();
	    	    return org;*/
		
				
				
		  
		  
		
		  // entityManager.persist(org);
		   entityManager.getTransaction().commit();
		   
		   
		   entityManager.close();
		   e.close();
		
	}
	
	
}
