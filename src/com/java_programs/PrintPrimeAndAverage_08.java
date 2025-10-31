package com.java_programs;

public class PrintPrimeAndAverage_08 {

	/**
	 * @param args
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
