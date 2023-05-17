package com.emresef.week003.day01;

import java.util.Iterator;
import java.util.Random;

public class DizilerTeori {

	public static void main(String[] args) {

		String ogr1 = "Emre";
		String ogr2 = "Sefa";
		String ogr3 = "Özcan";

		final int OGRENCI_DIZI_ELEMAN_SAYISI = 10 * 2;

		String[] ogrenciListe = new String[OGRENCI_DIZI_ELEMAN_SAYISI];
		int notlar[] = new int[OGRENCI_DIZI_ELEMAN_SAYISI];

		System.out.println(notlar[1]);
		System.out.println(ogrenciListe[1]);
		System.out.println(notlar.length);

		//////////////////////////////////////////
		// Dizi elemanlarına değer atama:

		ogrenciListe[0] = "Engin Akalın";
		ogrenciListe[1] = "Murat Can Cürebal";
		ogrenciListe[2] = "Berk Aktaş";

		ogrenciListe[7] = "Emre Sefa Özcan";

		double finalnotu[] = { 20, 30, 40, 50, 40, 50 };
		System.out.println("Dizinin birinci indexi: " + finalnotu[1]);

		for (int i = 0; i < finalnotu.length; i++) {
			System.out.print("Sırasıyla final notları: ");
			System.out.println(finalnotu[i]);
		}

		// 20 tane int değerlerden oluşan notlar dizisi tanımlayın.
		// içerisinde 0-100 arası rastgele norlar doldurun for döngüsü ile

		// Burada eleman sayısını yazarız ama Sout içinden çıktı alırken [] içine
		// yazdıgımız değer eleman sayısını değil sıra sayısını verir.
		int[] not = new int[20]; // [x] x elemanlı dizi oluşturmak

		Random rnd = new Random();

		// Dizi içine 0-101 arası norları random olarak doldurur.
		for (int i = 0; i < not.length; i++) {
			not[i] = rnd.nextInt(0, 101);
		}
		// Sıralama yapar ve Random not verir.
		for (int i = 0; i < not.length; i++) {
			System.out.println(i + " " + not[i]);
		}
		// 15. sıradaki notu belirtir.
		System.out.println(not[19]); // Erişilmeye çalışılan index eleman sayısından büyük olursa hata verir.

		// for each (read only):
		for (String ogrenci : ogrenciListe) {
			// Ogrenci listesini indexine göre sıraladı.
			System.out.println(ogrenci);
		}

		// 10 elemanlı rastgele elemanlardan olsuan intSayilar dizisi tanımla.
		// Bu dizideki sayılarıon toplamını ve ortalamasını yazdırın.
		// Değerler [0-100][ arası olsun

		int[] sayilar = new int[10]; // 10 elemanlı bir dizi tanımladık.
		Random rndSayi = new Random(); // Random nesnemizi oluşturduk.
		int sum = 0;
		// (sayilar.length)= sayilar dizisinin uzunluğu
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = rndSayi.nextInt(0, 101);
		}
		for (int i : sayilar) {
			sum += i;
		}
		System.out.println("Toplam= " + sum + " Ort: " + (sum / sayilar.length));

		
		String [] days = new String[] {"pazartesi", "çarşamba"};
			for (int i = 0; i < days.length; i++) {
				System.out.println(days[i]);
			}
	}

}
