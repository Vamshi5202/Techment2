package com.tech.day12.newfeature;

interface Compare{
	String largest(int a,int b,int c);
}


public class LamdaDemo4 {
	public static void main(String[] args) {
		Compare compare=(a,b,c)->{
			if(a>b&&a>c) {
				return "a is the largest number";
			}
			else if(b>c&&b>c) {
				return "b is the largest number";
			}
			else 
			return "c is largest number";
		};
		compare.largest(2,3,4);
	}

}
