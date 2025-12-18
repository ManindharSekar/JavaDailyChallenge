
package com.java_programs;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicateInString {

	// Program: REMOVE DUPLICATE IN STRING
	// Day: 30
	// Added on: 18-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "programming";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (char ch : s.toCharArray()) {
			set.add(ch);
		}

		StringBuilder result = new StringBuilder();
		for (char c : set) {
			result.append(c);

		}
		System.out.println(result);

	}

}
