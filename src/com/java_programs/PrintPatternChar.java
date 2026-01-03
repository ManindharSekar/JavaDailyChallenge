package com.java_programs;

public class PrintPatternChar {

	// Program: PRINT PATTER IN CHARACTERS
	// Day: 34
	// Added on: 03-JAN-2026

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 97;
		char c = (char) k;

		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((j % 2) != 0) {
					System.out.print(c);
					c++;
					System.out.print(c);
					c++;
				} else {
					System.out.print(" ");
					c++;
				}
			}
			System.out.println();
			c++;
		}

	}

}
