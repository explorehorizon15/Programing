package com.bridgelabz.junittest;

import java.util.Scanner;


public class BinaryNibbles {
    public static int binarynibbles(){
    Scanner src= new Scanner(System.in);
    System.out.println("Enter D No:");
     int x=src.nextInt();
     System.out.println("Enter D No:"+x);
        int v= ((x & 0x0F)<<4 | (x & 0xF0)>>4);
        System.out.println("V:"+v);
        src.close();
        return v;
    }
    public static void main(String args[]){
    binarynibbles();
    }
}

