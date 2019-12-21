package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {

    public static String windChill() {
        Scanner src = new Scanner(System.in);
        double t = src.nextDouble();
        double v = src.nextDouble();
        double pow = Math.pow(v, 0.16);
        if (t < 50 && v > 3 && v < 120) {
            double wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * pow;
            System.out.println("WindChill is=" + wind);
        } else {
            System.out.println("T should be less than 50 and V should be greater than 3 and less than 120");
        }
        src.close();
        return t + " " + v;
    }

    public static void main(String args[]) {
        windChill();
    }
}
