package com.bridgelabz.core;

public class Power2 {

    public static int power2(int n) {
        System.out.println("Enter a No:");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "=" + Math.pow(2, i));

        }
        return n;
    }

    public static void main(String args[]) {
        power2(10);
    }

}
