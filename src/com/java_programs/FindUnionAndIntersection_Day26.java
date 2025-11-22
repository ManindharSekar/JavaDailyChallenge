package com.java_programs;

public class FindUnionAndIntersection_Day26 {

	// Program: Find Union And InterSection from Two Arrays.
	// Day: 26
	// Added on: 22-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 4, 5, 6, 7, 8, 9 };
		int c[] = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.print("Union: ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		System.out.print("Intersection: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i]);
				}
			}
		}

	}

}
