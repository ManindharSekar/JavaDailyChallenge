package com.java_programs;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCharInString {

	// Program: FIND DUPLICATE CHARACTER IN STRING
	// Day: 30
	// Added on: 18-Dec-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = s.next();

		HashSet<Character> seen = new HashSet<Character>();
		HashSet<Character> duplicate = new HashSet<Character>();

		for (char c : str.toCharArray()) {
			if (!seen.add(c)) {
				duplicate.add(c);
			}
		}

		System.out.println(duplicate);

	}

}
