package com.emresef.week002.day04;

import java.util.Scanner;

public class While_HarfSayısıBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Kelime giriniz: ");
		String kelime = sc.next(); // Tek kelime, boşluk basılana kadar devam eder.

		// String kelimenextline=sc.next();
		// Enter tusuna basılana kadar devam eder (nextline)

		int i = 0;
		int uzunluk = 0;
		while (i < kelime.length()) {
			uzunluk++;
			i++;

		}
		System.out.println("kelimenin harf sayısı: " + uzunluk);

	}

}
