package com.java_programs;

public class CommonElements_Day09 {

	/*
	 * Program: COMMON ELEMENTS BETWEEN TWO ARRAY 
	 * Day: 09 
	 * Added on: 1-Nov-2025
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = { 2, 5, 4, 10, 44, 3, 77, 9, 1 };
		int array2[] = { 77, 8, 2, 6, 5, 4, 55, 90, 7 };
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println("Common elements is: " + array1[i]);
				}
			}
		}

	}

}
