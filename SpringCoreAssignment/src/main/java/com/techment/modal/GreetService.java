package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GreetService {
	
@Autowired
@Qualifier("goodDayGreeting")
Greeting greeting;


public void printGreet() {
	greeting.greet();
}
	
}

