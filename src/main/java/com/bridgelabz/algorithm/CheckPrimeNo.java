package com.bridgelabz.algorithm;

import java.util.Scanner;

public class CheckPrimeNo {
public static int primeno() {
	Scanner src=new Scanner(System.in);
	int n=src.nextInt();
	int m=n/2;
	int flag=0;
	if(n==0||n==1) {
		System.out.println(n+" No is not prime.");
	}
	else {
		for(int i=2;i<m;i++) {
			if(n%i==0) {
				flag=1;
				System.out.println(n+"No is not prime.");
			}
		}
	}
	
	if(flag==0) {
		System.out.println(n+"No IS Prime");
	}
	

	src.close();
	return n;
}	
public static void main(String args[]) {
	primeno();
}
}
