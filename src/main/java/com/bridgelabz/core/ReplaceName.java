package com.bridgelabz.core;


import java.util.Scanner;

public class ReplaceName {

    public static String replace() {
        System.out.println("Enter a Name");
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String old = "Hello User";
        String current = old.replaceAll("User", s1);
        System.out.println("orginal string: " + old);
        System.out.println("replaced string: " + current);
        s.close();
        return s1;
    }

    public static void main(String args[]) {
        replace();

    }
}
