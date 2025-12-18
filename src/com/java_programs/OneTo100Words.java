package com.java_programs;

import java.util.Scanner;

public class OneTo100Words {

	// Program: PRINT NUMBERS IN WORDS
	// Day: 10
	// Added on: 2-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n, digit1, digit2;
		String a[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty",
				"seventy", "eighty", "ninety", "hundred" };
		String b[] = { "", "one", "two", "three", "four", "five", "six",
				"seven", "Eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		System.out.println("Enter any number 1 to 100");
		n = s.nextInt();
		if ((n <= -1) || (n >= 101)) {
			System.out.println("wrong input");
		}
		if ((n >= 1) && (n <= 19)) {
			System.out.println(b[n]);
		}

		if ((n >= 20) && (n <= 100)) {
			digit1 = n / 10;
			digit2 = n % 10;
			System.out.println(a[digit1] + " " + b[digit2]);

		}

	}

}
