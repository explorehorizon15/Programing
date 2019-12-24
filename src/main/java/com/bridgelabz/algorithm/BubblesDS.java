package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubblesDS {
	
	public static int[] sort(int arr[]) {
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			
		}
		
		return arr;
	}
	
	public static void printarray(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
	int arr[]= {65,88,41,62,31};
	
	System.out.println("Before Sorted array are:");
	 for(int obj:arr){  
         System.out.print(obj+ " ");  
     }  
	  
     System.out.println();
     arr= sort(arr);
	
	System.out.println("Sorted array are:");
	printarray(arr);
	
		

	}

}
