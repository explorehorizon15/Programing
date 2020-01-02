package com.bridgelabz.algorithm;

public class FactRecursion {

	public static int fact(int n) {
		if (n == 0) 
	          return 1; 
	          
	        return n*fact(n-1); 
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println(n+"factorial is :"+fact(5));
	}

}
