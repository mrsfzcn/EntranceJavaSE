package com.emresef.week003.day03;

public class CokBoyutluDizilerSatirSutun {

	public static void main(String[] args) {
		
		//Bu dizideki her satır ve sütundaki elemanların toplamını ayrı ayrı bulun.
		
		int[][] sayilar={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
				};
		
		
		for (int i = 0; i < sayilar.length; i++) { //Satır sayısına kadar
			int toplam=0;
			for (int j = 0; j < sayilar[i].length; j++) { //Sütun sayısına kadar ilerler
				toplam+=sayilar[i][j];			
				}
			System.out.println((i+1)+". satırın toplamı: "+toplam);
		}
		
		// 2. Adım: sütun toplamları
		// [0][0]	[1][0]	[2][0]	[3][0]
		
		for (int i = 0; i < sayilar[0].length; i++) { //Sütun sayısı 4
			int toplam=0;
			for (int j = 0; j < sayilar.length; j++) { //Satır sayısı 3
				toplam+=sayilar[j][i];
			}
			System.out.println((i+1)+". sütun toplamı: "+toplam);
		}
	}
}
