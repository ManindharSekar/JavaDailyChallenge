package com.java_programs;

public class PatterDiamondWords {

	// Program: Diamond Pattern ALLAHABAD
	// Day: 32
	// Added on: 19-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c = { 'A', 'L', 'L', 'A', 'H', 'A', 'B', 'A', 'D' };

		int z = 0;

		for (int i = 1; i <= 3; i++) {
			for (int j = 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {

				System.out.print(c[z] + " ");
				z++;
			}

			System.out.println();
		}

		for (int i = 2; i > 0; i--) {
			for (int j = 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {

				System.out.print(c[z] + " ");
				z++;
			}
			System.out.println();
		}

	}

}
