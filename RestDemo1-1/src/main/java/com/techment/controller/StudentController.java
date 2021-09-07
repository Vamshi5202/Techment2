package com.techment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Student;

@RestController
@RequestMapping(value="/studentController")
public class StudentController {
	
	@GetMapping(value="/getStudent")
	public Student getStudent() {
		
		return new Student("ragu","ram");
	}
	
	@GetMapping(value="/listStudents")
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<Student>();
		students.add(new Student("pk","vk"));
		students.add(new Student("mojo","dito"));
		return students;

	}
	@GetMapping("{firstName}/{lastName}")
	
	public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastname) {
		
		return new Student(firstName,lastname);
	}
	//localhost:8080/studentController/student/query/?firstName=pk&lastName=vk
	@GetMapping(value="/student")
	public Student studentQueryParam(@RequestPart(name="firstName")  String firstName,@RequestParam(name="lastName")   String lastName) {
		return new Student(firstName,lastName);
	}
	
	
	
	
	

}
