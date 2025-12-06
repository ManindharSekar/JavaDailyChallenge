package com.java_programs;

public class Triangle_Day28 {

	// Program: Print Triangle Pattern
	// Day: 28
	// Added on: 06-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			for (int k = 4; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
