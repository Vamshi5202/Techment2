package com.techment.Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();

		System.out.println("enter size of arraylist");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			list.add(i);
		}
		if (size == 10) {
			for (int i = 0; i < size / 2; i++) {
				list2.add(i);
			}
			System.out.println(list2);

			for (int i = size/2; i < size ; i++) {
				list3.add(i);
			}
			System.out.println(list3);

		} else if (size == 11) {
			for (int i = 0; i < size / 2; i++) {
				list2.add(i);
			}
			System.out.println(list2);
			for (int i = size/2; i < size; i++) {
				list3.add(i);
			}
			System.out.println(list3);
		}

	}

}
