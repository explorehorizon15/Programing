package com.bridgelabz.algorithm;

public class base {
public static void main(String[] args) {
	
	int arr[]= {22,55,77,88,24,56,99};
	int i=0;
	int max=0,min=arr[i];
	for( i=0;i<arr.length;i++) {
	
		
		if(max<arr[i]) {
			max=arr[i];
			
		}
		
		if(min>arr[i]) {
			min=arr[i];
			
		}
	}
	System.out.println("max is:\t"+max);
	System.out.println("min is:\t"+min);
	
}
}
