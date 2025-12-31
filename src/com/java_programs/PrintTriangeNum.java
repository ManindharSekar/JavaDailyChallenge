package com.java_programs;

public class PrintTriangeNum {

	// Program: PRINT TRIANGLE NUM
	// Day: 33
	// Added on: 31-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		for (int i = 0; i < 3; i++) {
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				if (j == i || j == 0) {
					if (j == i) {
						System.out.print(" " + (n - i));
					} else {
						System.out.print(" " + (n + i));
					}
				} else {
					System.out.print(" " + n);
				}
				n++;
			}
			System.out.println();
		}

	}

}
