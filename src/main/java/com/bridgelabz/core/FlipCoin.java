package com.bridgelabz.core;

public class FlipCoin {
	public static int flipcoin(int n) {
        int counttail = 0;
        int counthead = 0;
        for (int i = 0; i < n; i++) {
            Math.random();
            if (Math.random() < 0.5) {

                counttail++;
            } else {
                counthead++;
            }

        }
        System.out.println("Percentage of Heads=" + ((counthead * 100) / n));
        System.out.println("Percentage of Tails=" + ((counttail * 100) / n));
        return n;
    }

    public static void main(String args[]) {
        flipcoin(10);
    }

}
