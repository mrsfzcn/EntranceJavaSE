package com.emresef.week003.day02;

public class CokBoyutluDiziler {

	public static void main(String[] args) {

		int[][] koordinatlar = { { 3, 7 }, { 5, 9 }, { 6, 10 } };

		int[][] noktalar = { { 1, 2, 3 }, { 4, 5, 6 } };
		// { {0.Sütun, 1.Sütun, 2. Sütun {0.Satır, 1.Satır}}
		int[][] dizi1 = new int[2][3];
		// Matris Gösterimi:
		// 1 2 3
		// 4 5 6
		// 2 satır 3 sütun: Satır için 0.index ve 1. index
		// Sütun için 0,1 ve 2. index
		dizi1[0][0] = 1;
		dizi1[0][1] = 2;
		dizi1[0][2] = 3;
		dizi1[1][0] = 4;
		dizi1[1][1] = 5;
		dizi1[1][2] = 6;

		// Satır sayısı
		System.out.println(dizi1.length);

		for (int i = 0; i < noktalar.length; i++) {

		}

	}

}
