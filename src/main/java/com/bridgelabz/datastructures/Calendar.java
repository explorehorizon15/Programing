package com.bridgelabz.datastructures;

public class Calendar {

	public static boolean isLeapYear(int year)
	{
	
		if(year%400==0||(year%4==0 && year%100!=0))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		

	}

}
