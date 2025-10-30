package com.java_programs;

import java.util.Scanner;

public class SumOfNbyGivenNum_Day07 {

	/*
	 * Program: CALCULATE SUM OF 1....N Given NUMBERS: Day: 07 Added on:
	 * 30-Oct-2025
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		long num = s.nextLong();
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("Sum of " + num + " is: " + sum);

	}

}
