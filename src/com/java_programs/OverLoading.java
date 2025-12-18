package com.java_programs;

public class OverLoading {

	// Program: OVERLOADING CONCEPT
	// Day: 13
	// Added on: 5-Nov-2025

	static void meth(int a) {
		System.out.println(a);
	}

	static void meth(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth(5);
		meth("Manindhar");

	}

}
