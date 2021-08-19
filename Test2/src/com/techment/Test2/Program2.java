package com.techment.Test2;

public class Program2 {

	public static void main(String[] args) {
		System.out.println(Twice("hello", 3));
	}

	public static String Twice(String s, int n) {
		String newWord = "";
		for (int i = 0; i < n; i++) {
			newWord += s.substring(s.length() - n, s.length());
		}
		return newWord;
	}

}
