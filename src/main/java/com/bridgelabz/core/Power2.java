package com.bridgelabz.core;

public class Power2 {

    public static int power2(int n) {
        System.out.println("Enter a No:");
        int power=0;
        for (int i = 1; i <= n; i++) {
        	power= (int)Math.pow(2, i);
            System.out.println(i + "=" +power );

        }
        System.out.println(power);
        return power;
    }

    public static void main(String args[]) {
        power2(10);
    }

}
