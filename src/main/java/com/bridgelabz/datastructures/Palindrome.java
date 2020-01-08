package com.bridgelabz.datastructures;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Palindrome {
	Queue queue= new LinkedList();
	public   void palindrome() {
		Scanner src=new Scanner(System.in);
		String s1=src.next();
		String s2="";
		int len=s1.length();
		for(int i=len-1;i>=0;i--) {
			queue.add(s1.charAt(i));
		}
		 while (!queue.isEmpty()) {
	            s2 = s2+queue.remove();
	        }
		System.out.println("Reverse String is:"+s2);
		if(s1.equals(s2)) {
			System.out.println("String is Palindrome");
			
		}else {
			System.out.println("String is Not Palindrome");
		}
		src.close();
		
		
	}
      public static void main(String[] args) {
    	Palindrome obj= new Palindrome();
		obj.palindrome();
		
      
	}

}
