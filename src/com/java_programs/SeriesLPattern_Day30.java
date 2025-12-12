package com.java_programs;

public class SeriesLPattern_Day30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				if(a==4){
					a=0;
				}
				System.out.print(a);
				a++;
			}
			System.out.println();
		}

	}

}
