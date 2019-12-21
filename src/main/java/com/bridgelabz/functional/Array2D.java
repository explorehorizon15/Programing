package com.bridgelabz.functional;

import java.util.Scanner;

public class Array2D {

    public static int[][] array1() {
        int arr[][], m, n;

        System.out.println("Enter an 2D array:");

        Scanner src = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        m = src.nextInt();
        System.out.println("Enter no of rows:" + m);
        System.out.println("Enter no of columns:");
        n = src.nextInt();
        System.out.println("Enter no of columns:" + n);
        arr = new int[m][n];
        System.out.println("Enter value of m and n:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = src.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        src.close();
        return arr;
    }

    public static void main(String args[]) {

        array1();

    }
}
