package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

public class OneToOneClientDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
	
		Address address=new Address();
		
		address.setDoorNo(101);
		address.setStreetName("JublieHills");
		address.setCity("Hyderabad");
		
		Employee employee=new Employee();
		employee.setId(3);
		employee.setName("diya");
		employee.setDesignation("developer");
		employee.setAddress(address);
		
		em.persist(address);
		em.persist(employee);
		System.out.println("Inserted");
		
		
		em.getTransaction().commit();
		

	}

}
