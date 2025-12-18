package com.java_programs;

interface A13 {
	final int a = 25;

	void display();

}

public class IntrfaceDemo implements A13 {

	// Program: INTERFACE CONCEPT
	// Day: 15
	// Added on: 7-Nov-2025

	public void display() {
		// TODO Auto-generated method stub

		System.out.println("MANINDHAR");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntrfaceDemo demo = new IntrfaceDemo();
		demo.display();
		System.out.println(demo.a);

	}

}
