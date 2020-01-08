package com.bridgelabz.core;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
//		int n1=45;
//		int n2=n1%10;
//		int n3=n1/10;
//		System.out.println(n2);
//		System.out.println(n3);
		Scanner src= new Scanner(System.in);
		System.out.println("Enter 1st No:");
		int n1=src.nextInt();
		System.out.println("Enter 2nd No for power:");
		int power=src.nextInt();
		int result=1;
		while(power!=0) {
			result=result*n1;
			power--;
		}
		System.out.println("n1="+result);
		n1=result;
		System.out.println("Current value of n1="+n1);
		int sum=0;
		while(n1!=0) {
		     sum=sum+n1%10;
		     n1=n1/10;	
		}
		System.out.println("sum="+sum);

		if(n1==sum) {
			System.out.println("Neon no");
		}else {
			System.out.println("Not a Neon No");
		}

	}

}
