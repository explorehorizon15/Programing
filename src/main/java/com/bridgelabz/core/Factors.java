package com.bridgelabz.core;

import java.util.Scanner;

public class Factors {
	 public static int factors(int n) {
	        
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact = (int) fact * i;
	        }
	        System.out.println("Factorial No:" + fact);
	       
	        return fact;

	    }

	    public static void main(String args[]) {
	        factors(5);
	    }

}
