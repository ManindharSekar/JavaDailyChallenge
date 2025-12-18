package com.java_programs;

import java.util.HashSet;

public class FindDuplicateInArray {

	// Program: FIND DuplicteInArray
	// Day: 30
	// Added on: 18-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 2, 4, 5, 1 };

		HashSet<Integer> seen = new HashSet<Integer>();
		HashSet<Integer> duplicates = new HashSet<Integer>();

		for (int num : a) {
			if (!seen.add(num)) {
				duplicates.add(num);
			}
		}
		System.out.println(" Remove Duplicates: " + duplicates);

	}

}
