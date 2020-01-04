package com.bridgelabz.datastructures;

import java.util.Scanner;

public class PrimeArray {

	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] generate(int n) {
		
		int []arr= new int[n];
		int index=0;
		for(int i=0;i<n;i++) {
			if(isPrime(i)) {
				arr[index++]=i;

			}
			

		}
		return arr;
	}
	
	public static int[] print(int[]a1,int n) {
		
		for(int i=0;i<n;i++) {
			System.out.print(a1[i]+" ");
		}
		return a1;
	}
	public static void main(String[] args) {

		int array[]=generate(200);
		print(array,50);

	}

}
