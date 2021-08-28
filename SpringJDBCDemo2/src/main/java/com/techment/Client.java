package com.techment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("object.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		 EmployeeDao dao=(EmployeeDao) factory.getBean("employee");
		 dao.saveEmployee(new Employee(102,"bk",510000));
		
		
	}


}
