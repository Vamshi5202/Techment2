package com.test2.onetomany;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

public class OneToManyClientDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		
		Emp e1=new Emp("raju","developer");
		Emp e2=new Emp("hari","hr");
		//to store in database
		em.persist(e1);
		em.persist(e2);

//to store all employees in list 
		List<Emp> employees=new ArrayList<Emp>();
		employees.add(e1);
		employees.add(e2);
				
		Department department=new Department();
		department.setName("hr");
		department.setEmployees(employees);
		em.persist(department);

		em.getTransaction().commit();
		em.close();

	}

}
