package com.bridgelabz.core;
import java.util.Scanner;
public class Harmonic {
	public static double harmonic(int n) {
        double sum = 0;
        
        if (n != 0) {
            for (int i = 2; i < n; i++) {
                sum += (float) 1 / i;
            }
        } else {
            System.out.println("No can not be zero");
        }
        System.out.println("Harmonic No is:" + sum);
 
        return sum;
    }

    public static void main(String args[]) {
    	int n;

        System.out.println("Enter a no:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println("Enter a no:" + n);
        harmonic(n);

    }

}
