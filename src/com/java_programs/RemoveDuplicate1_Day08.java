package com.java_programs;

import java.util.Arrays;

public class RemoveDuplicate1_Day08 {

	/*
	 * Program: REMOVE DUPLICATE NUMBER IN ARRAY 
	 * Day: 08 
	 * Added on: 31-Oct-2025
	 */

	public static int remove(int a[], int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		int t[] = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				t[j++] = a[i];
			}
		}
		t[j] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = t[i];
		}
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 8, 5, 4, 3, 2, 6, 8 };
		Arrays.sort(a);
		int length = a.length;
		length = remove(a, length);
		for (int i = 0; i < length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
