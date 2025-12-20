package com.java_programs;

public class PatternDiamond {

	// Program: Diamond * Pattern
	// Day: 32
	// Added on: 19-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for (int r = 1; r <= (n + 1) / 2; r++) {
			for (int c = 1; c <= (n + 1) / 2 - r; c++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= r; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int r = (n + 1) / 2; r > 0; r--) {
			for (int c = 1; c <= (n + 1) / 2 - r; c++) {
				System.out.print(" ");
			}
			for (int i = 1; i < r; i++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
