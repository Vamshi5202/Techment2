package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.service.DtabaseService;

public class ClientApp {

	public static void main(String[] args) {

AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		DtabaseService dbservice=(DtabaseService) context.getBean("dtabaseService");
	
            dbservice.displayDatabaseInfo();
	
	}

}
