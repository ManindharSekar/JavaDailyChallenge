package com.java_programs;

import java.util.Arrays;

public class ShuttleSort_Day12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,2,5,71,22,9,4,1};
		int temp;
		System.out.println("Before Sort: "+Arrays.toString(a));
		for(int i=1;i<a.length;i++){
			if(a[i]>a[i-1]){
				temp=a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
			}
			for(int z=i-1;(z-1)>=0;z--){
				if(a[z]>a[z-1]){
					temp=a[z];
					a[z]=a[z-1];
					a[z-1]=temp;
				}else{
					break;
				}
			}
		}
		System.out.println(Arrays.toString(a));
				

	}

}
