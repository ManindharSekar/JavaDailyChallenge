package com.java_programs;

import java.util.Stack;

public class DecimalToBinary {

	// Program: CONVERT DECIMAL TO BINARY USING STACK
	// Day: 25
	// Added on: 18-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int r;
		System.out.print("Binary Of " + n + " is ");
		Stack stk = new Stack();
		while (n != 0) {
			r = n % 2;
			stk.push(r);
			n = n / 2;
		}

		while (!stk.isEmpty()) {
			System.out.print(stk.pop());
		}

	}

}
