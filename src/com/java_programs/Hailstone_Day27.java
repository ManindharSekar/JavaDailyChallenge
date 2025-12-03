package com.java_programs;

import java.util.Scanner;

public class Hailstone_Day27 {

	// Program: PROGRAM TO GENERATE HAILSTONE NUMBER STARTS FROM 7
	// Day: 27
	// Added on: 03-Dec-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = scanner.nextInt();
		meth(num);

	}

	private static void meth(int num) {
		// TODO Auto-generated method stub
		if (num <= 0) {
			System.out.println("Invalid Input");

		}
		if (num == 1) {
			return;
		}
		if (num % 2 != 0) {
			int a = num * 3 + 1;
			System.out.print(a + " ");
			meth(a);
		} else {
			int a = num / 2;
			System.out.print(a + " ");
			meth(a);
		}

	}

}
