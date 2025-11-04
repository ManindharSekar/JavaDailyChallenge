package com.java_programs;

import java.util.Arrays;

public class ArrMergrSort_Day12 {

	// Program: SORT ARRAY AND MERGE ARRAY
	// Day: 12
	// Added on: 4-Nov-2025

	static int[] mergeArray(int[] array1, int[] array2) {
		int[] mergedArray = new int[array1.length + array2.length];
		int i = 0, j = 0, k = 0;
		while (i < array1.length) {
			mergedArray[k] = array1[i];
			i++;
			k++;
		}
		while (j < array2.length) {
			mergedArray[k] = array2[j];
			j++;
			k++;
		}
		Arrays.sort(mergedArray);
		return mergedArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] { 5, 2, 9, 1, 8 };
		int[] array2 = new int[] { 7, 10, 3, 6, 4 };
		int[] mergedArray = mergeArray(array1, array2);
		System.out.println("Array1: " + Arrays.toString(array1));
		System.out.println("Array2: " + Arrays.toString(array2));
		System.out.println("Merged Array: " + Arrays.toString(mergedArray));

	}

}
