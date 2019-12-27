package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sample {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(15);
		al.add(20);
		al.add(10);
		al.add(5);
		al.add(7);
	
		for(Integer obj:al) {
			System.out.print(obj+" ");
		}
		System.out.println();
		Collections.sort(al);
		System.out.println("step 1 for sorting array:");
	    System.out.println(al+" ");
	    System.out.println("step 2 for sorting array");
	    for(Integer obj:al) {
			System.out.print(obj+" ");
		}
		

	}

}
