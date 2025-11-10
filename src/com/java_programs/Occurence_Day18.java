package com.java_programs;

public class Occurence_Day18 {

	// Program: Number of occurences of the array elements
	// Day: 18
	// Added on: 10-Nov-2025
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 1, 1, 3 };
		int b[] = new int[a.length];
		int v = -1;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					b[j] = v;
				}
			}
			if (b[i] != v) {
				b[i] = count;
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] != v) {
				System.out.println(a[i] + "-" + b[i] + " times");
			}
		}

	}

}
