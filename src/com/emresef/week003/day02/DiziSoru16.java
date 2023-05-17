package com.emresef.week003.day02;

import java.util.Scanner;

import javax.xml.transform.Source;

public class DiziSoru16 {

	public static void main(String[] args) {

		// Önce dizi eleman sayısını ve dizideki elemanları kullanıcıdan alınız.
		// dizideki en büyük elemanı bulan ve bulunduğu indexi yazan programı yazınız.

		Scanner sc = new Scanner(System.in);
		System.out.println("Dizinin eleman sayısını girin: ");
		int elemanSayisi = sc.nextInt();

		int maxIndex = 0;
		int minIndex = 1;

		System.out.println("Dizi elemanlarını giriniz");
		int dizi[] = new int[elemanSayisi];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = sc.nextInt();
		}
		int max = dizi[0];
		for (int i = 0; i < dizi.length; i++) {
			if (max <= dizi[i]) {
				maxIndex = i;
			}
			max = dizi[i];
		}
		System.out.println("En büyük= " + max + " index: " + maxIndex);

		// En küçük elemanı bulunuz

		int min = dizi[1];
		for (int i = 0; i > dizi.length; i++) {
			if (min >= dizi[i]) {
				minIndex = i;
			}
			min = dizi[i];
		}
		System.out.println("En küçük: " + min + " index:" + minIndex);
	}
}
