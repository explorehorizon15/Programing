package com.bridgelabz.core;

import java.util.Scanner;

public class Factors {
	 public static int factors() {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        float fact = 1;
	        for (int i = 1; i < n; i++) {
	            fact = (float) fact * i;
	        }
	        System.out.println("Factorial No:" + fact);
	        s.close();
	        return n;

	    }

	    public static void main(String args[]) {
	        factors();
	    }

}
