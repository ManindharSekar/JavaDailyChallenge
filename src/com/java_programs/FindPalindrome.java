package com.java_programs;
import java.util.Scanner;

public class FindPalindrome {

	// Program: FIND PALINDROME
	// Day: 30
	// Added on: 18-Dec-2025

	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.next();

		System.out.println(isPalindrome(str));

	}

}
