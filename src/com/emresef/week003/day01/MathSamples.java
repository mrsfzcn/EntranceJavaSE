package com.emresef.week003.day01;

import java.util.Random;

public class MathSamples {

	public static void main(String[] args) {

		System.out.println(Math.PI);
		// Math.PI: pi sayısını veren metotdur.

		// Daire alanı: PI*r*r

		double r = 3.0;
		double alan = Math.PI * Math.pow(r, 2);
		// Mat.pow(x,y) = x^y --- x üzeri y alan bir metoddur.
		System.out.println(alan);

		///////////////////////////////////////////////

		Random rnd = new Random();
		System.out.println(rnd.nextInt(101));

		// örnek Zar 1-6
		System.out.println(rnd.nextInt(6) + 1);

		// Origin, Bound

		for (int i = 100; i >= 0; i--) {
			System.out.print(rnd.nextInt(1, 7) + " ");
		}

	}

}
