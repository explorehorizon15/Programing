package com.bridgelabz.algorithm;

public class InsertionSort {

	public static int[] insertionsort(int arr[]) {
		
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int j=i-1;
			int key=arr[i];
		while(j>=0 && arr[j]>key) {
			arr[j+1]=arr[j];
			j=j-1;
	
			
		}
		arr[j+1]=key;
		}
		return arr;
	}
	
	public static int[] printarray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {77,88,99,100,65,44,133,22,11};
		insertionsort(arr);
		printarray(arr);

	}

}
