package com.java_programs;

public class LargestSmallest {

	// Program: FIND LARGEST AND SMALLEST NUMBER IN ARRAY WITHOUT USING
	// SORTING METHOD
	// Day: 23
	// Added on: 16-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 3, 1, 56, 23, 95 };
		int largest = a[0];
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
			if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		System.out.println("Largest Number is: " + largest);
		System.out.println("Smallest Number is:" + smallest);

	}

}
