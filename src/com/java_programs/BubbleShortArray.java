package com.java_programs;

public class BubbleShortArray {

	// Program: SORT NUMBER IN ASCENDING ORDER USING BUBBLE SORT ALGORITHAM
	// Day: 11
	// Added on: 3-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 2, 7, 22, 89, 11, 45 };
		int length = a.length;
		int temp = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}

	}

}
