package com.tech.day12.newfeature;

class Parent{
	void phone() {
		System.out.println("mi");
	}
}

public class AnonomysInnerClass {
public static void main(String[] args) {
	Parent parent=new Parent();
	parent.phone();
	Parent parent2=new Parent()
	{
		void phone() {
			System.out.println("samsung");
		}
	};
	parent2.phone();
}
}

