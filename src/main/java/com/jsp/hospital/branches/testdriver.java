package com.jsp.hospital.branches;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class testdriver {
	
	public static void main(String[] args) {
		
		
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sairaj"); 
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    
	    
	    
	    Hospital hospital=new Hospital();    
	    hospital.setGstno("126637");
	    hospital.setName("mgm");
	    
	    
	    Branch  branch1=new Branch();
	    branch1.setLocation("vashi");
	    branch1.setName("mgm1");
	    
	    

	    Branch  branch2=new Branch();
	    branch2.setLocation("belapur");
	    branch2.setName("mgm2");
	    
	    

	    Branch  branch3=new Branch();
	    branch3.setLocation("panvel");
	    branch3.setName("mgm3");
	    
	    branch1.setHospital(hospital);
	    branch2.setHospital(hospital);
	    branch3.setHospital(hospital);
	    
	    
	   
	   entityTransaction.begin();
	   entityManager.persist(hospital);
	   entityManager.persist(branch1);
	   entityManager.persist(branch2);
	   entityManager.persist(branch3);
	   entityTransaction.commit();
	   
	   
	   
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		}
	

}
