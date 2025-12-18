package com.java_programs;

public class SecLargeNumArrarNoSort {
	
	// Program: SECOND LARGEST NUMBER IN ARRAY
	// Day: 30
	// Added on: 18-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 35, 1, 10, 34, 1 };

		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}

		}

		System.out.println(findSecondLargest(arr));

	}

	private static int findSecondLargest(int[] arr) {

		if (arr.length < 2) {
			return -1;
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
	}

}
