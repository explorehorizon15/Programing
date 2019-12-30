package com.bridgelabz.algorithm;

import java.util.Scanner;

public class FibonaciSeries {
	public static int fibonaciseries(int n) {
		int t1=0,t2=1;
		for(int i=0;i<n;i++) {
			System.out.print(t1+"+");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		fibonaciseries(n);

	}

}
