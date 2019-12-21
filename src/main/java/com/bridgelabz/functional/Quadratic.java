package com.bridgelabz.functional;

import java.util.Scanner;

public class Quadratic {

    public static String quadratic() {
        Scanner src = new Scanner(System.in);
        double a = src.nextDouble();
        double b = src.nextDouble();
        double c = src.nextDouble();
        double delta = b * b - 4 * a * c;
        System.out.println("Delta is=" + delta);
        if (delta == 0) {
            double x = src.nextDouble();
            double rootEq = a * x * x + b * x + c;
            System.out.println("Roots are:" + rootEq);
        } else if (delta > 0) {
            double eq1 = ((-b + Math.sqrt(delta)) / 2 * a);
            double eq2 = ((-b - Math.sqrt(delta)) / 2 * a);
            System.out.println("Root Equation1 are::" + eq1);
            System.out.println("Root Equation2 are::" + eq2);
        } else if (delta < 0) {
            double eq1 = ((Math.sqrt(-delta)) / 2 * a);
            double eq2 = ((Math.sqrt(delta)) / 2 * a);
            System.out.println("Root Equation1 are::" + eq1);
            System.out.println("Root Equation1 are::" + eq2);

        }
        src.close();
        return a + " " + b + " " + c;
    }

    public static void main(String args[]) {
        quadratic();
    }
}
