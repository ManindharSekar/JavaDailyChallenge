package com.java_programs;

public class FindAfter3Index {

	// Program: FIND AFTER 3 INDEX
	// Day: 16
	// Added on: 8-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 4, 6, 9, 6, 1 };
		for (int i = 0; i < a.length; i++) {
			if (i < 3) {
				System.out.println("NOT FOUND");
			} else {
				System.out.println("FOUND");
			}
		}

	}

}
