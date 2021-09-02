package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

public class ManyToOneClientDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Address1 address=new Address1();
		address.setBuildingNo(25);
		address.setStreetName("malik");
		address.setCity("Hyderabad");
		 
		em.persist(address);
		
     //  Employee emp1=new Employee(1,"murthy","hr",address);
		
	// Employee emp2=new Employee(2,"jaanu","developer",address);
		Employee1 emp1=new Employee1();
		emp1.setId(1);
		emp1.setName("murthy");
		emp1.setDesignation("hr");
		emp1.setAddress(address);
		
		Employee1 emp2=new Employee1();
		emp2.setId(1);
		emp2.setName("jaanu");
		emp2.setDesignation("developer");
		emp2.setAddress(address);
	 
		
		em.persist(emp1);
		em.persist(emp2);

		em.getTransaction().commit();

	}
	

}
