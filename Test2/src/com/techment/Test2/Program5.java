package com.techment.Test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Persons{
	private int id;
	private int age;
	public Persons(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class Program5 {

	public static void main(String[] args) {
		Map<Integer,Persons>mapPerson=new HashMap<Integer, Persons>();
		Persons person1=new Persons(100, 20);
		Persons person2=new Persons(101,14 );
		mapPerson.put(1, person1);
		mapPerson.put(2,person2);
		
		Program5 voteEligibility=new Program5();
		voteEligibility.Eligibilit(mapPerson);
			}
	void Eligibilit(Map<Integer,Persons>vote) {
		List<Integer> list=new ArrayList<Integer>();
		for( Persons p:vote.values()) {
			if(p.getAge()>18) {
				list.add(p.getId());
			}
			
		}
	}
	

	
}
