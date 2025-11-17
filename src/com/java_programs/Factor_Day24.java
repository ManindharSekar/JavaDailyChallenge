package com.java_programs;

public class Factor_Day24 {

	// Program: PROGRAM TO EVALUATE THE GIVEN SERIES 1/2+2/3+3/4+......+N
	// Day: 24
	// Added on: 17-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 1; i <= 3; i++) {
			sum = sum + (i * 1.0) / (i + 1.0);
		}
		System.out.println(sum);

	}

}
