package com.emresef.week003.day03;

public class DiziSoru20 {

	public static void main(String[] args) {

		// {20,19,20,40,3,40,5,3,7,3} elemanlarından oluşan

		int[] dizi1 = { 20, 19, 20, 40, 3, 40, 5, 3, 7, 3 };
		int[] dizi2;
		// dizi2 nin eleman sayısı belli değil...

		int dizi2Uzunluk = dizi1.length;

		// Eleman sayısı belirlemek

		for (int i = 0; i < dizi1.length; i++) {
			for (int j = i + 1; j < dizi1.length; j++) {
				if (dizi1[i] == dizi1[j]) {
					dizi2Uzunluk--;
					break;
				}
			}
		}
		System.out.println("Yeni Dizinin Elemean Sayısı: " + dizi2Uzunluk);

		dizi2 = new int[dizi2Uzunluk];
		dizi2[0] = dizi1[0];
		boolean esitMi = false;
		int sayac = 0;

		for (int i = 0; i < dizi1.length; i++) {
			esitMi = false;
			for (int j = 0; j < dizi2.length; j++) {
				if (dizi1[i] == dizi2[j]) {
					esitMi = true;
					break;
				}
			}
			if (!esitMi) {
				sayac++;
				dizi2[sayac] = dizi1[i];
				if (dizi2.length == sayac + 1)
					break;
			}
		}
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}
	}
}