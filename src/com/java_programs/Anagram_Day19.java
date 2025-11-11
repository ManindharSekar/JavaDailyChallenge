package com.java_programs;

import java.util.Arrays;

public class Anagram_Day19 {

	// Program: PROGRAM FOR ANAGRAM:
	// Day: 19
	// Added on: 11-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silent";
		boolean c = isAnagram(s1, s2);
		if (c) {
			System.out.println(s1 + " and " + s2 + "is an anagram.");
		} else {
			System.out.println(s1 + " and " + s2 + "is not an anagram.");
		}

	}

	private static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.toString(c1).equals(Arrays.toString(c2))) {
			return true;
		}
		return false;
	}

}
