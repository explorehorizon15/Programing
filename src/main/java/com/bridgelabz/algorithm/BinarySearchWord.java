package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BinarySearchWord {
	public static String[] sorted(String a[]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(a[i].compareTo(a[j])>0) {
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}	
		}
		return a;
	}

	public static void main(String[] args) {
    String a[]= {"mango","apple","kiwi","strawberry","pineapple","coconut"};
    sorted(a);
    for(String print:a) {
    	System.out.print(print+"  ");
    }
    System.out.println();
    Scanner src=new Scanner(System.in);
    System.out.println("Enter key :");
    String key=src.nextLine();
   
    for(int k=0;k<a.length;k++) {
    	
    	if(key.compareTo(a[k])==0 || key.equalsIgnoreCase(a[k])) {
    		
    		System.out.println(key+ "Is On index no:"+k);
    		
    	
    }
    }
    
	}

}
