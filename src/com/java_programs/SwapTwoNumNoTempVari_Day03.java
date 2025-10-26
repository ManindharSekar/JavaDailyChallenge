package com.java_programs;

public class SwapTwoNumNoTempVari_Day03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 2;
		System.out.println("BEFORE SWAP");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("AFTER SWAP");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
