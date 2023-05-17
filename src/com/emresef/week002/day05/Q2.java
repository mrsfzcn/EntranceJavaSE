package com.emresef.week002.day05;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Soru 3: Çarpım tablosunda sadece girilen sayının tablosunu oluşturma
		// 3*3=9
		// 2*6=12

		Scanner sc = new Scanner(System.in);
		System.out.println("Ilk sayiyi giriniz.");
		int sayi = sc.nextInt();

		int sonuc;

		for (int i = 1; i <= 10; i++) {
			sonuc = sayi * i;

			System.out.println(sayi + "*" + i + "=" + sonuc);
		}
	}
}
