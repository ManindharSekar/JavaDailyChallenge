package com.java_programs;

public class FirstNonRepeatNum {
	
	// Program: FIND FIRST NON REPEATING NUM IN ARRAY
		// Day: 31
		// Added on: 19-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,1,2,0,4};
		System.out.println(firstNonRepNum(arr));
		

	}

	private static int firstNonRepNum(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					count++;
				}
			}
			if(count==0) {
				return arr[i];
			}
		}
		return -1;
		
	}

}
