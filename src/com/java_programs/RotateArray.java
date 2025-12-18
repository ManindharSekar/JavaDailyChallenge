package com.java_programs;

public class RotateArray {

	// Program: ROTATE THE GIVEN INTEGER ARRAY:
	// Day: 18
	// Added on: 10-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = a.length - 1;
		for (int i = 3; i <= k; i++) {
			System.out.print(a[i] + " ");
			if (a[i] == a.length) {
				i = -1;
				k = 2;
			}
		}
		System.out.println();

		int k1 = 0;
		for (int i = 3; i >= k1; i--) {
			System.out.print(a[i] + " ");
			if (i == 0) {
				i = 7;
				k1 = 4;
			}
		}

	}

}
