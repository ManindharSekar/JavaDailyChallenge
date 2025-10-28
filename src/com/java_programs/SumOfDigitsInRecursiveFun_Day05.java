package com.java_programs;

public class SumOfDigitsInRecursiveFun_Day05 {

	private static int sumOfDigits(int num) {
		if (num == 0) {
			return 0;
		}
		return num % 10 + sumOfDigits(num / 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = sumOfDigits(45385);
		System.out.println("Sum of Digits is: " + n);

	}

}
