package com.java_programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxOccurCharInString_Day23 {

	// Program: Find out the Maximum Occuring Character in String.
	// Day: 23
	// Added on: 17-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Simple String";
		int max = 0;
		char c[] = s.toCharArray();
		String s1 = "";
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (char c1 : c) {
			if (!m.containsKey(c1)) {
				m.put(c1, 1);
			} else {
				m.put(c1, m.get(c1) + 1);
				max++;
			}
		}
		for (Map.Entry<Character, Integer> m1 : m.entrySet()) {
			if (max == m1.getValue()) {
				s1 = s1 + " " + m1.getKey();
			}
		}
		System.out.println(s1);

	}

}
