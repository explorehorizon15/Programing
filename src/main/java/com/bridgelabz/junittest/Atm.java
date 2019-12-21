package com.bridgelabz.junittest;

public class Atm {

    public static int atm(int amount) {

        int[] note = {2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] notecount = new int[11];
        for (int i = 0; i < note.length; i++) {
            if (amount >= note[i]) {
                notecount[i] = amount / note[i];
                amount = amount - notecount[i] * note[i];
            }
        }
        int n = note.length;
        for (int i = 0; i < n; i++) {
            System.out.println(i + "is" + note[i] + "::" + notecount[i]);

        }
        System.out.println("maximum value is:" + note[note.length - 1]);
        return amount;
    }

    public static void main(String args[]) {
        atm(1253);

    }
}
