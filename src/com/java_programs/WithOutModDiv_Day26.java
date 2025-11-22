package com.java_programs;

public class WithOutModDiv_Day26 {

	// Program: FIND QUOTIENT AND REMAINDER WITHOUT USING MOD OR DIV
	// Day: 26
	// Added on: 22-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 89;
		int divisor = 4;
		int quotient = 0;
		while (dividend >= divisor) {
			dividend = dividend - divisor;
			quotient++;
		}

		System.out.println("Quotient is: " + quotient);
		System.out.println(("Reminder is:" + dividend));

	}

}
