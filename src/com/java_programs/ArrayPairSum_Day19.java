package com.java_programs;

public class ArrayPairSum_Day19 {

	// Program: FIND OUT THE PAIRS IN SUM EQUAL TO 20
	// Day: 19
	// Added on: 11-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findThePairs(new int[] { 5, 8, 3, 4, 12, 17, 15, 16 }, 20);

	}

	private static void findThePairs(int[] a, int num) {
		// TODO Auto-generated method stub
		System.out
				.println("Pair of element whose input number " + num + " are");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == num) {
					System.out.println(a[i] + "+" + a[j] + "=" + num);
				}
			}
		}

	}

}
