package com.techment.Test2;

public class Program1 {

	public static void main(String[] args) {

		System.out.println(repeatFront("Chocolate",4));
	}
	public static String repeatFront(String s,int n) {
		String newString="";
		for(int i=n;n>0;n--) {
			newString+=s.substring(0,n);
			
		}
		return newString;
	}

}
