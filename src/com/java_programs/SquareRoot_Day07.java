package com.java_programs;

public class SquareRoot_Day07 {

	/*
	 * Program: write a program to check whether the sqrt-num is prime or not. if
	 * not prime, print the factors. Day: 07 Added on: 30-Oct-2025
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sq = Math.sqrt(49);
		System.out.println(sq);
		if (1 >= 0) {
			int c = 0;
			for (int i = 1; i <= sq; i++) {
				if ((sq % i) == 0) {
					System.out.println(i);
					c++;
				}
			}
			if (c == 2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not a Prime Number");
			}
		}

	}

}
