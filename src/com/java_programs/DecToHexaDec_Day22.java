package com.java_programs;

import java.util.Stack;

public class DecToHexaDec_Day22 {

	// Program: DECIMAL TO HEXA DECIMAL USING STACK
	// Day: 22
	// Added on: 15-Nov-2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2567;
		int rem = 0;
		Stack<String> stk = new Stack<String>();
		String str = "";
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
				'B', 'C', 'D', 'E', 'F' };
		while (num > 0) {
			rem = num % 16;
			str = hex[rem] + str;
			System.out.print("Pushed element: ");
			System.out.println(stk.push(str));
			num = num / 16;
		}
		System.out.println();
		while (!stk.isEmpty()) {
			System.out.print("Poped element: ");
			System.out.println(stk.pop());
		}

	}

}
