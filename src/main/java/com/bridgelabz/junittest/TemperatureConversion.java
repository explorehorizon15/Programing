package com.bridgelabz.junittest;

import java.util.Scanner;

public class TemperatureConversion {

    public static double temperatureConversion() {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the Choice:");
        System.out.println("1.Celcius to Farenheit OR 2.Farenheit to Celcius");
        int ch = src.nextInt();
        System.out.println();
        switch (ch) {
            case 1:
                System.out.println("Enter Temperature in Celcius:");
                double C = src.nextDouble();
                double TF = (C * 9 / 5) + 32;
                System.out.println("Celcius to Farenheit Conversion is:" + TF);
                break;
            case 2:
                System.out.println("Enter Temperature in Farenheit:");
                double F = src.nextDouble();
                double TC = (F - 32) * 5 / 9;
                System.out.println("Farenheit to Celcius Conversion is:" + TC);
                break;
            default:
                System.out.println("Enter a Valid Choice 1 or 2");
        }
        src.close();
        return ch;
    }

    public static void main(String args[]) {
        temperatureConversion();
    }
}

