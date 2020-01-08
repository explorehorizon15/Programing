package com.bridgelabz.datastructures;

import java.util.Scanner;

public class BankCashCounter {
	Queue q=new Queue();
	Scanner src= new Scanner(System.in);
	private int count;
	public Queue bankcashcounter(int amount) {
		count = 0;
		while(amount>0) {
		System.out.println("Choose D Following Options to Perform Bank Operations:");
		System.out.println("1:Deposite Purpose Only");
		System.out.println("2:Withdraw Purpose Only");
		System.out.println("3:Check Current Bank Account Balance");
		
		int choice=src.nextInt();
		
		switch(choice) {
		
		case 1:{
                 System.out.println("Enter D amount 2 be Deposit.");
			     int deposit=src.nextInt();
			     amount=amount+deposit;
			     q.enqueue(count++); 
			     break;
		}
		case 2:{
			System.out.println("Enter amount 2 be Withdraw.");
			int Withdraw=src.nextInt();
			if(Withdraw<=amount) {
			amount=amount-Withdraw;
			}else {
				System.out.println("Insufficient Funds");
			}
			 q.enqueue(count++); 
			break;}
		
		case 3:{
			System.out.println("Current Account Balance is="+amount);
		}
		default:{
			System.out.println("Please Choose D valid Options 1 or 2 or 3");
		}
		}
		
	}
		
		src.close();
		return q;
	}	

	public static void main(String[] args) {
		
		BankCashCounter obj= new BankCashCounter();
		Scanner src= new Scanner(System.in);
		System.out.println("Enter D amount::");
		int amount =src.nextInt();
//		obj.bankcashcounter(amount);
		Queue q1=obj.bankcashcounter(amount);
		q1.show();
		src.close();


	}

}
