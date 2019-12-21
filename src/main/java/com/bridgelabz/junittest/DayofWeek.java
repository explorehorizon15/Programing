package com.bridgelabz.junittest;

import java.util.Scanner;

public class DayofWeek {

    public static int dayofWeek() {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Day:");
        int d = src.nextInt();
        System.out.println("Enter Month:");
        int m = src.nextInt();
        System.out.println("Enter Year:");
        int y = src.nextInt();
        int y0 = y - (14 - m) / 12;
        System.out.println("Y0=" + y0);
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        System.out.println("X=" + x);
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        System.out.println("M0=" + m0);
        int dw = (d + x + 31 * m0 / 12) % 7;
        System.out.println("Day of week=" + dw);
        
        switch (dw) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        src.close();
        return dw;
    }

    public static void main(String args[]) {
        dayofWeek();
    }
}
