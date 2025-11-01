package com.java_programs;

public class PrintPrimeAndAverage_08 {

	/*
	 * Program: 1 to 100 prime numbers and Calculate Average 
	 * Day: 08 
	 * Added on: 31-Oct-2025
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,a=0;
		float avg;
		for(int i=2;i<=100;i++){
			boolean b= true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					b=false;
					break;
				}
			}
			if(b==true){
			System.out.print(i+" ");
			sum+=i;
			a++;
			}
		}
		System.out.println("\nSum of prime Number is:"+sum);
		avg=sum/a;
		System.out.println("Average of prime number is: "+avg);

	}

}
