package com.bridgelabz.algorithm;

public class DisplayPrimeNo {

	
	public static void main(String[] args) {
		char arr[];
		int i=0;
		int n=1000;
		int num=0;
		String a1[];
		String prime="";
		for( i=1;i<=n;i++) {
			int counter=0;
		for (num=i;num>=1;num--) {
			if(i%num==0) {
				counter =counter+1;
			}
			
		}
		if(counter==2) {
			prime=prime+i+" ";
			
		}
		
		}
		System.out.println("prime nos:"+prime);
       arr=prime.toCharArray();
       System.out.println("Prime no in character array are:");
       System.out.println(arr);
       
	}

}
