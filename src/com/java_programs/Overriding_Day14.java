package com.java_programs;

class A7 {
	void show() {
		System.out.println("super class method");
	}
}

class B11 extends A7 {
	void show() {
		System.out.println("sub class method");
	}
}

public class Overriding_Day14 {

	// Program: SORT ARRAY AND MERGE ARRAY
	// Day: 12
	// Added on: 4-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B11 b = new B11();
		b.show();

	}

}
