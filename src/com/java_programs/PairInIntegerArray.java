package com.java_programs;

public class PairInIntegerArray {
	
	// Program: FIND THE PAIRS IN GIVEN ARRAY
		// Day: 30
		// Added on: 18-Dec-2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,3,5,7,8};
		int n=6;
		
		findPairs(a,n);

	}

	private static void findPairs(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
					System.out.println("("+a[i]+","+a[j]+")");

			}
		}
	}

}
