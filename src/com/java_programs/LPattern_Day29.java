package com.java_programs;

public class LPattern_Day29 {

	// Program: print number in LPattern
	// Day: 29
	// Added on: 08-Dec-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a);
				a--;
			}
			System.out.println();
		}

	}

}
