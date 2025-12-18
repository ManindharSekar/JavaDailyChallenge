package com.java_programs;

public class Harshhad {

	// Program: write a program for harshad number or niven number.
	// Day: 27
	// Added on: 04-Dec-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sumOfDigit(21);
		System.out.println(sum);
		if (21%sum == 0) {
			System.out.println("Niven No");
		} else {
			System.out.println("Not a Niven No");
		}

	}

	public static int sumOfDigit(int i) {
		// TODO Auto-generated method stub
		if (i == 0) {
			return 0;
		}
		return i % 10 + sumOfDigit(i / 10);
	}

}
