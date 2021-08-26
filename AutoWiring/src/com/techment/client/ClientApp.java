package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.techment.modal.University;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("object.xml");

		BeanFactory factory = new XmlBeanFactory(resource);
		University university=(University) factory.getBean("u");
		university.displayDeptDetails();
	

	}

}
