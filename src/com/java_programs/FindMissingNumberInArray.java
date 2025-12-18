package com.java_programs;

public class FindMissingNumberInArray {

	// Program: FIND MISSING NUMBER IN ARRAY
	// Day: 30
	// Added on: 18-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 2, 4, 6, 5, 8 };
		int n = 8;

		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int num : a) {
			actualSum += num;
		}

		int result = expectedSum - actualSum;
		System.out.println(result);

	}

}
