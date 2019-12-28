package junittest;

import java.util.Scanner;

public class Testunit {
	public static int factors(int n) {

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = (int) fact * i;
		}
		System.out.println("Factorial No:" + fact);

		return fact;

	}

	public static double harmonic(int n) {
		double sum = 0;

		if (n != 0) {
			for (int i = 2; i < n; i++) {
				sum += (float) 1 / i;
			}
		} else {
			System.out.println("No can not be zero");
		}
		System.out.println("Harmonic No is:" + sum);

		return sum;
	}

	public static int power2(int n) {
		System.out.println("Enter a No:");
		int power = 0;
		for (int i = 1; i <= n; i++) {
			power = (int) Math.pow(2, i);
			System.out.println(i + "=" + power);

		}
		return power;
	}

	public static boolean leapYear(int year) {

		if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
			System.out.println(+year + "\tis a Leap Year");
		} else {
			System.out.println(+year + "\tis Not a Leap Year");
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		factors(num);

		System.out.println("Enter a no:");
		int n = sc.nextInt();
		System.out.println("Enter a no:" + n);
		harmonic(n);

		int year = sc.nextInt();
		System.out.println("Enter a Year:" + year);
		leapYear(year);
	}

}
