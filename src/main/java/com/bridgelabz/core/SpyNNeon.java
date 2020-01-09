package com.bridgelabz.core;

public class SpyNNeon {
	
	public static void power() {
		int n1=10;
		int n2=4;
		int result=1;
		while(n2!=0) {
			result=result*n1;
			n2--;
		}
		System.out.println("Power="+result);
	}

	public static void spy() {
		int n1=1145678;
		//
		int sum=0;
		int res=1;
		while(n1!=0) {
			int digit=n1%10;
			sum=sum+digit;
			res=res*digit;
			n1=n1/10;
		}
		System.out.println("Sum="  +sum);
		System.out.println("result of multiplication="+res);
	}
	
	public static void main(String[] args) {
		power();
		spy();

	}

}
