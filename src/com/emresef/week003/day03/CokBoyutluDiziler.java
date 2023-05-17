package com.emresef.week003.day03;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] sinifListesi = new String[4][4];
		sinifListesi[0][0] = "1";
		sinifListesi[0][1] = "101";
		sinifListesi[0][2] = "Ece";
		sinifListesi[0][3] = "80";

		sinifListesi[1][0] = "2";
		sinifListesi[1][1] = "102";
		sinifListesi[1][2] = "Su";
		sinifListesi[1][3] = "60";

		sinifListesi[2][0] = "3";
		sinifListesi[2][1] = "103";
		sinifListesi[2][2] = "Ali";
		sinifListesi[2][3] = "50";

		sinifListesi[3][0] = "4";
		sinifListesi[3][1] = "104";
		sinifListesi[3][2] = "Ertan";
		sinifListesi[3][3] = "30";

		// Çok boyutlu dizinin tüm elemanlarını listeleme:
		// Satır sayısına göre:
		for (int i = 0; i < sinifListesi.length; i++) {
			// Sütun sayısına göre
			for (int j = 0; j < sinifListesi.length; j++) {
				System.out.print(sinifListesi[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Dizide belirli bir satırdaki elemanları yazdırma:
		//[0][0]	[0][1]	[0][2]	[0][3]
		
		System.out.println("***Dizide belirli bir satırdaki elemanları yazırma***");
		
		int yazdirilacakSatir=1;
		for (int i = 0; i < sinifListesi[yazdirilacakSatir].length; i++) {
			System.out.print(sinifListesi[yazdirilacakSatir][i]+"\t");
		}
		
		//Dizideki belirli bir sütundaki elamanları yazdırma:
		//[0][0]	[1][0]	[2][0]	[3][0]
		System.out.println();
		System.out.println("***Dizide belirli bir sütundaki elemanları yazırma***");
		
		int yazdirilacakSütun=3;
		for (int i = 0; i < sinifListesi.length; i++) {
			System.out.print(sinifListesi[i][yazdirilacakSütun]+"\t");
		}
		
		System.out.println();
		//Not sütunundaki notların toplamanı ve ortalamasını yazdır.
		System.out.println("***Not sütunundaki notların toplamanı ve ortalamasını yazdırma***");
		int top=0;
		for (int i = 0; i < sinifListesi.length; i++) {
			top+=Integer.parseInt(sinifListesi[i][3]);
		}
		System.out.println("Toplam: "+top+" Ortalama: "+(top/sinifListesi.length));
	}
}
