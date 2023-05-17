package com.emresef.week003.day04;

import java.util.Scanner;

public class SinifListesiOrnekD04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int secim;
		int sinifMevcudu = 0;
		String[] sinifListesi = null;
		int[] matNotlari = null;

		do {
			System.out.println("*************************");
			System.out.println("*****OKUL OTOMASYONU*****");
			System.out.println("*************************");
			System.out.println("1-Sınıf Tanımla");
			System.out.println("2-Öğrencileri Tanımla");
			System.out.println("3-Sınıf Listesini göster");
			System.out.println("4-Not ver");
			System.out.println("5-Notları Listele");
			System.out.println("0-Çıkış");

			System.out.println("Seçiminizi giriniz:");
			secim = sc.nextInt();
			sc.nextLine(); // nextLine basılan enter ı yok ediyor.

			switch (secim) {
			case 1:
				System.out.println("*************************");
				System.out.println("*****SINIF TANIMLA*****");
				System.out.println("*************************");
				System.out.println("Sınıf mevcudunu giriniz:");
				sinifMevcudu = sc.nextInt(); // nextLine basılan enter ı yok ediyor.
				sc.nextLine();
				sinifListesi = new String[sinifMevcudu];
				break;
			case 2:
				System.out.println("*************************");
				System.out.println("*****ÖĞRENCİ TANIMLA*****");
				System.out.println("*************************");

				for (int i = 0; i < sinifListesi.length; i++) {
					System.out.println((i + 1) + "2-Öğrencileri Tanımla");
					sinifListesi[i] = sc.nextLine();

				}
				break;
			case 3:
				System.out.println("*************************");
				System.out.println("*****SINIF LİSTELE*****");
				System.out.println("*************************");
				for (int i = 0; i < sinifListesi.length; i++) {
					System.out.println(sinifListesi[i]);
				}
				System.out.println("Ana menü için Enter bas.");
				sc.nextLine();
				break;
			case 4:
				System.out.println("*************************");
				System.out.println("*****NOT GİRİŞİ*****");
				System.out.println("*************************");
				matNotlari = new int[sinifMevcudu];
				for (int i = 0; i < matNotlari.length; i++) {
					System.out.println(sinifListesi[i] + " adlı öğrencinin 1. notunu giriniz.");
					int not1 = sc.nextInt();
					sc.nextLine();

					if (not1 < 0 || not1 > 100) {
						System.out.println("Not girişi 0-100 arası olmalı");
						i--;
						continue;
					}
					System.out.println(sinifListesi[i] + "adlı öğrencinin 2. notunu giriniz.");
					int not2 = sc.nextInt();
					sc.nextLine();
					if (not2 < 0 || not2 > 100) {
						i--;
						continue;
					}
					int ort = (not1 + not2) / 2;
					matNotlari[i] = ort;
				}
				break;
			case 5:
				System.out.println("*************************");
				System.out.println("*****NOT LİSTELE*****");
				System.out.println("*************************");
				System.out.println("Ad \t Not");
				System.out.println("__ \t ___");
				for (int i = 0; i < matNotlari.length; i++) {
					System.out.println(sinifListesi[i] + "\t" + matNotlari[i]);
				}
				System.out.println("Ana menü için Enter bas.");
				sc.nextLine();
				break;
			case 0:
				System.out.println("Çıkış yapıldı");
				break;

			default:
				System.out.println("Lütfen geçerli bir seçim yapınız.");
				break;
			}
		} while (secim != 0);

	}

}
