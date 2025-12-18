package com.java_programs;

class A {
	int a;

	int getA() {
		return a;
	}
}

class B extends A {
	int b;

	int getB() {
		return b;
	}
}

public class Inheritance {

	// Program: INHERITANCE CONCEPT:
	// Day: 13
	// Added on: 5-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.a = 5;
		b.b = 10;
		System.out.println(b.getA());
		System.out.println(b.getB());

	}

}
