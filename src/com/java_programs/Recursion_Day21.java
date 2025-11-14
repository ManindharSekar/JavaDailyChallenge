package com.java_programs;

public class Recursion_Day21 {

	// Program: REVERSE THE NUMBER USING RECURSION
	// Day: 21
	// Added on: 14-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		System.out.print("reverse of the number is: ");
		reverseMeth(num);

	}

	private static void reverseMeth(int n) {
		// TODO Auto-generated method stub
		if (n < 10) {
			System.out.println(n);
		} else {
			System.out.print(n % 10);
			reverseMeth(n / 10);
		}

	}

}
