package com.bridgelabz.algorithm;

public class MergeSort {
	public static void merge(int arr[],int left,int mid,int right) {
		
		int n1=mid-left+1;
		int n2=right-mid;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for (int i=0;i<n1;i++)
		{
			L[i]=arr[left+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=arr[mid+1+j];
		}
		int i=0,j=0;
		int k=left;
		while(i<left&&j<right) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<left) {
		arr[k]=L[i];	
			i++;
			k++;
		}
		while(j<right) {
			arr[k]=R[j];
			j++;
			k++;
		}
		
	}
	public static void sort(int arr[],int left,int right) {
		left=0;
		right=arr.length-1;
		int mid1=(left+right)/2;
		if(left<right) {
		int mid=mid1;
		sort(arr,left,mid);
		sort(arr,mid+1,right);
		merge(arr,left,mid,right);
		}
		}

	public static void main(String[] args) {
	int arr[]= {25,54,85,97,75};
	sort(arr,0,arr.length-1);
	System.out.println("Sorted array are:");
	System.out.println("\nSorted array");  
	for(int i =0; i<arr.length;i++)  
	{  
	    System.out.println(arr[i]+"");  
	}  

	}

}
