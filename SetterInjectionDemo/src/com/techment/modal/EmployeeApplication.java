package com.techment.modal;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.client.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {

		Resource resource=new ClassPathResource("object.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Employee employee=(Employee) factory.getBean("employe");
		employee.displayEmployeeDetails();
		
		
	}

}
