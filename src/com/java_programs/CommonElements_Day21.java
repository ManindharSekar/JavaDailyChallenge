package com.java_programs;

public class CommonElements_Day21 {

	// Program: Common Element Between Two Arrays
	// Day: 21
	// Added on: 14-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 10, 15, 20, 25 };
		int b[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(b[j] + " ");
				}
			}
		}

	}

}
