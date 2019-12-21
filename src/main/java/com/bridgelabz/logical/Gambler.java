package com.bridgelabz.logical;

import java.util.Scanner;

public class Gambler {

    public static String gambler() {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter D stake amount:");
        int stake = src.nextInt();
        System.out.println("Enter D goal amount:");
        int goal = src.nextInt();
        System.out.println("Enter D no of Times:");
        int times = src.nextInt();
        
        int wins = 0;
        for (int i = 0; i < times; i++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                if (Math.random() > 0.5) {
                    cash++;
                } else {
                    cash--;
                }
                if (cash == goal) {
                    wins++;
                }
            }

        }
        System.out.println("Wins=" + wins);
        System.out.println("Percentage of Wins=" + (100 * wins / times));
        src.close();
        return stake + " " + goal + " " + times;
        
    }

    public static void main(String args[]) {
        gambler();
    }
}
