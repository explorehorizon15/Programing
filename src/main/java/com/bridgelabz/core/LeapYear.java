package com.bridgelabz.core;

import java.util.Scanner;

public class LeapYear {
	 public static int leapYear() {
	        System.out.println("Enter a Year:");
	        Scanner s = new Scanner(System.in);
	        int year = s.nextInt();
	        System.out.println("Enter a Year:" + year);
	        if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
	            System.out.println(+year + "is a Leap Year");
	        } else {
	            System.out.println(+year + "is Not a Leap Year");
	        }
	        s.close();
	        return year;
	    }

	    public static void main(String args[]) {
	        leapYear();
	    }
	

}
