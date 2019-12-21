package com.bridgelabz.functional;
import java.util.Scanner;

public class Sumof3Array {

    public static int[] sumof3Array() {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter an array:");
        for (int i = 0; i < n; i++) {
            arr[i] = src.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 1; j < n - 1; j++) {
                for (int k = 2; k < n; k++) {
                    int b = arr[i] + arr[j] + arr[k];
                    if (b == 0) {
                        System.out.print(arr[i] + " " + arr[j] + " " + arr[k] + " ");
                        count += 3;
                    }
                }
            }
            System.out.println(count);
        }
        src.close();
        return arr;
    }

    public static void main(String args[]) {
        sumof3Array();
    }
}