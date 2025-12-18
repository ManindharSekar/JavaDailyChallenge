package com.java_programs;

public class ReverseArray {

	// Program: Reverse the given array
	// Day: 20
	// Added on: 13-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6 };
		for (int x : a) {
			System.out.print(x + " ");
		}
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i = i + 1;
			j = j - 1;
		}
		System.out.println();
		for (int x : a) {
			System.out.print(x + " ");
		}

	}

}
