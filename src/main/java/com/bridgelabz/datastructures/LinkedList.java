package com.bridgelabz.datastructures;

public class LinkedList {

	public static void main(String[] args) {
	int fact=1;
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			fact = fact * i;
//		}
//		System.out.println("Factorial No:" + fact);
	System.out.println("using Recursion");
	int op= fact(7);
	System.out.println("Factorial No:" + op);
	System.out.println("using Recursion="+fact(8));
	}
	
	public static int fact(int n) {
		if(n<=0) {
			return 1;
		}
			int o= n*fact(n-1);
			
		return o;
	}
}
