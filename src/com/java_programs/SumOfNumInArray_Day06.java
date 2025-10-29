package com.java_programs;

public class SumOfNumInArray_Day06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]={2,5,4,7,1,4};
		int sum=0;
		for(int i=0;i<nums.length;i++){
			sum=sum+nums[i];
		}
		System.out.println("Sum of given number is: "+sum);

	}

}
