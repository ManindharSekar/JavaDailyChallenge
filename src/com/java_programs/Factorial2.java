package com.java_programs;

public class Factorial2 {

	// Program: FIND THE SUM OF GIVEN SERIES 1/1!+1/2!+1/3!+1/4!+..........
	// Day: 22
	// Added on: 15-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 4;
		double sum = 0, f = 1;
		for (int i = 1; i <= val; i++) {
			f = f * i;
			sum = sum + (1 / f);
		}
		System.out.println(sum);

	}

}
