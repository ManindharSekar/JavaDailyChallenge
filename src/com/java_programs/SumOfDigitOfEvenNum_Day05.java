package com.java_programs;

public class SumOfDigitOfEvenNum_Day05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5648352;
		int last;
		int odd = 0;
		int even = 0;
		while (n != 0) {
			last = n % 10;
			if (last % 2 == 0) {
				even = even + last;
			} else {
				odd = odd + last;
			}
			n = n / 10;
		}
		System.out.println("Sum of Odd Number is: " + odd);
		System.out.println("Sum of Even Number is: " + even);

	}

}
