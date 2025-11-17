package com.java_programs;

public class Factorial3_Day24 {

	// Program: FIND THE FACTORIAL USING RECURSION
	// Day: 24
	// Added on: 17-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println("Factorial of " + n + " is " + getFactorial(n));

	}

	private static int getFactorial(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return 1;
		} else {
			return n * getFactorial(n - 1);
		}

	}

}
