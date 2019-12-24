package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubbleSort {
	public static int[] arraySort() {
		Scanner src= new Scanner(System.in);
		System.out.println("Enter Total No of Element:");
		int n=src.nextInt();
		System.out.println("Total No of Element are:"+n);
		int arr[]=new int[n];
		System.out.println("Enter Element for array:");
		for(int i=0;i<n;i++) {
				arr[i]=src.nextInt();
			}
		System.out.println("Enter array are:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
			
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;	
				}	
			}	
		}
		System.out.println("Sorted array are:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		src.close();
		return arr;
	}
	public static void main(String args[]) {
		
		arraySort();
		
	}

}
