package com.bridgelabz.logical;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CouponNo {

    public static int couponNo() {
         	 Set<Object> hs= new HashSet<Object>();
              int cn, n;
       
        Scanner src = new Scanner(System.in);
        n = src.nextInt();
        for (int j = 0; j < n; j++) {
            cn = (int) (Math.random() * n);
            hs.add(cn);

        }
         Iterator itr=hs.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        src.close();
        return n;
    }

    public static void main(String[] args) {
        couponNo();
    }
}
