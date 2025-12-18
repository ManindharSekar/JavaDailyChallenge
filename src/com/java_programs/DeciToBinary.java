package com.java_programs;

public class DeciToBinary {

	// Program: Convert Decimal To Binary Format
	// Day: 11
	// Added on: 3-Nov-2025

	public static void toBinary(int decimal) {
		int binary[] = new int[10];
		int index = 0;
		while (decimal > 0) {
			binary[index++] = decimal % 2;
			decimal = decimal / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Binary of 10 is: ");
		toBinary(10);
		System.out.print("Binary of 55 is: ");
		toBinary(55);
		System.out.print("Binary of 25 is: ");
		toBinary(25);

	}

}
