package com.java_programs;

public class SecondLargeNumArray_Day04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		int array[] = { 40, 55, 30, 75, 32, 80, 45 };
		int size = array.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.print("Second largest number is: " + array[size - 2]);

	}

}
