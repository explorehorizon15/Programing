package com.bridgelabz.functional;

import java.util.Scanner;

public class Distance {

    public static double distance() {
        Scanner src = new Scanner(System.in);
        double x = src.nextDouble();
        double y = src.nextDouble();
        double a = Math.pow(x, x);
        double b = Math.pow(y, y);
        double c = a + b;
        double distance = Math.sqrt(c);
        System.out.println("Distance is=" + distance);
        src.close();
        return distance;
    }

    public static void main(String args[]) {
        distance();
    }
}
