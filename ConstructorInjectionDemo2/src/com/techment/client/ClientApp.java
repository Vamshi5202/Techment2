package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.modal.Employee;

public class ClientApp {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("object.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Employee employee=(Employee) factory.getBean("emp");
		System.out.println(employee.toString());
	}

}
