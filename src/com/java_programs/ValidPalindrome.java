package com.java_programs;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "A man, a plan, a canal: Panama";
		
		String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		System.out.println(isPalindrome(str));
		
	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}

}
