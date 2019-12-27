package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Guesslogic {

	public static int guessNo(int start,int end) {
		while(start!=end) {
			int mid=(start+end)/2;
			System.out.println("Enter 1: if"+start+"to"+mid+"OR:Enter 2: if"+(mid+1)+"to"+end);
			Scanner s=new Scanner(System.in);
			System.out.println("Enter D choice 1 oR 2:");
			int choice=s.nextInt();
			
			if(choice==2){
				start=mid+1;
				
			}
			if(choice==1){
				end=mid;
			}
			
			
				
		}
		
		return end;
	}
	public static void main(String[] args) {
		System.out.println(guessNo(0,100));

	}

}
