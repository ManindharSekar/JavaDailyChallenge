package com.java_programs;

public class NumOfSeries_Day10 {

	// Program: NUm of Series 3+33+333+3333......?
	// Day: 10
	// Added on: 2-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int n = 5;
		for (int i = 0; i <= n; i++) {
			a = (a * 10) + 3;
			System.out.print(a + "+");
		}

	}

}
