package com.techment.Test2;

public class Person {
	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) throws InvalidAgeException, InvalidNameException {
		super();
		this.id = id;
		if (name.length() >= 3) {
			this.name = name;
		} else {
			throw new InvalidNameException("name must contain 3 characters");
		}
		if (age >= 18) {
			this.age = age;
		} else {
			throw new InvalidAgeException("Invalid Age");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

class InvalidAgeException extends Exception {
	String msg;

	public InvalidAgeException(String msg) {
		super();
		this.msg = msg;
	}

}

class InvalidNameException extends Exception {
	String msg;

	public InvalidNameException(String msg) {
		super();
		this.msg = msg;
	}

}
