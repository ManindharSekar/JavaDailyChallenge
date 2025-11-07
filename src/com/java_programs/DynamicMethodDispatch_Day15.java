package com.java_programs;

class A14 {
	void callme() {
		System.out.println("inside A14 call method");
	}

}

class B14 extends A14 {
	void callme() {
		System.out.println("inside B14 call method");
	}

}

public class DynamicMethodDispatch_Day15 {

	// Program: PROGRAM TO EXPLAIN CONCEPT OF DYNAMIC DISPATCH OR RUN TIME
	// POLYMORPHISM
	// Day: 15
	// Added on: 7-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A14 a = new A14();
		B14 b = new B14();
		A14 r;
		r = a;
		r.callme();
		r = b;
		r.callme();

	}

}
