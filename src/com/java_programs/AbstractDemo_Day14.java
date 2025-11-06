package com.java_programs;

abstract class A12 {
	abstract void callme();
}

class B12 extends A12 {

	void callme() {
		// TODO Auto-generated method stub
		System.out.println("Dynamic used in abstract");

	}

}

public class AbstractDemo_Day14 {

	// Program: SORT ARRAY AND MERGE ARRAY
	// Day: 12
	// Added on: 4-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B12 o = new B12();
		A12 a;
		a = o;
		a.callme();

	}

}
