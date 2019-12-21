package com.bridgelabz.logical;

import java.util.Scanner;

public class CouponNo {

    public static int couponNo() {
        int cn, n;
       
        Scanner src = new Scanner(System.in);
        n = src.nextInt();
        for (int j = 0; j < n; j++) {
            cn = (int) (Math.random() * n);
            System.out.println("Coupon No=" + cn);

        }
        src.close();
        return n;
    }

    public static void main(String[] args) {
        couponNo();
    }
}
