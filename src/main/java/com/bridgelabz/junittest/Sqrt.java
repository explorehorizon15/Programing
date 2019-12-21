package com.bridgelabz.junittest;

import java.util.Scanner;

public class Sqrt {

    public static double sqrt() {
        double e=2.718;
        Scanner src = new Scanner(System.in);
        double c = src.nextDouble();
        double epsilon = 1.0*e-15;
        double t = c;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }

        System.out.println(t);
        src.close();
        return t;

    }

    public static void main(String args[]) {
        sqrt();
    }
}
