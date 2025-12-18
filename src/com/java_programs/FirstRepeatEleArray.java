package com.java_programs;

public class FirstRepeatEleArray {

	// Program: FIND FIRST REPEATED ELEMENT IN ARRAY
	// Day: 30
	// Added on: 18-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
		System.out.println(findFirstRepeatNum(arr, arr.length));

	}

	private static int findFirstRepeatNum(int[] arr, int length) {
		// TODO Auto-generated method stub

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;

	}

}
