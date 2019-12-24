package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean anagram() {
    	Scanner src=new Scanner(System.in);
    	System.out.println("Enter String 1::");
    	String s1=src.nextLine();
    	System.out.println("Enter String 2::");
    	String s2=src.nextLine();
    	char[]a1=s1.toCharArray();
    	char[]a2=s2.toCharArray();
    	int n1=a1.length;
    	int n2=a2.length;
    	
    	if(n1!=n2) {
    		return false;
    	}else {
    		Arrays.sort(a1);
    		Arrays.sort(a2);
    	
    	for(int i=0;i<n1;i++) {
    		if(a1[i]!=a2[i]) {
    			return false;
    		}
    	}
    	}
    	src.close();
    	return true;
    	}
	
	public static void main(String args[]) {
		
	
		if(anagram()) {
			System.out.println("Both are Anagram");
		}else {
			System.out.println("Both are not Anagram");
		}
		
		
	}

}
