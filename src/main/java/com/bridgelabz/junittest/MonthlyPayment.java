package com.bridgelabz.junittest;

import java.util.Scanner;


public class MonthlyPayment {
    public static double monthlyPayment(){
    Scanner src= new Scanner(System.in);
    System.out.println("Enter Principle Loan Amount:");
    double P=src.nextDouble();
    System.out.println("Principle Loan Amount:"+P);
    System.out.println("Enter Years:");
    double Y=src.nextDouble();
    System.out.println("Enter Years:"+Y);
    System.out.println("Enter Rate Interest:");
    double R=src.nextDouble();
    System.out.println("Rate Interest:"+R);
    double n=12*Y;
    double r=R/(12*100);
    double payment= ((P*r)/(1-Math.pow((1+r),(-n))));
    System.out.println("Payment Is:"+payment);
    src.close();
    return payment;
    }
    public static void main(String args[]){
    monthlyPayment();
    }
}

