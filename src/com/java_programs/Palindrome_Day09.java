package com.java_programs;

import java.util.Scanner;

public class Palindrome_Day09 {

	/*
	 * Program: PALINDROME OR NOT
	 * Day: 09 
	 * Added on: 1-Nov-2025
	 */

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if ((s.charAt(i)) != (s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		if (isPalindrome(s)) {
			System.out.println(s + " is palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}

	}

}
