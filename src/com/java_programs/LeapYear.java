package com.java_programs;

public class LeapYear {

	// Program: FIND THE YEAR IS LEAP YEAR OR NOT
	// Day: 25
	// Added on: 18-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2028;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

}
