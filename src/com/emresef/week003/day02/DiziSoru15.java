package com.emresef.week003.day02;

import java.util.Scanner;

public class DiziSoru15 {

	public static void main(String[] args) {

		int[] series = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("5 tane sayı giriniz");

		// dizi içine rastgele elemanlar doldur.
		for (int i = 0; i < series.length; i++) {
			series[i] = sc.nextInt();
		}

		// dizideki elemanları baştan sona yazırma.
		for (int i = 0; i < series.length; i++) {
			System.out.print(" " + series[i] +" ");
		}

		// bu dizideki elemanların yerlerini değiştirin.
		System.out.println();
		int temp = 0;
		for (int i = 0; i < series.length / 2; i++) {

			temp = series[i];
			series[i] = series[series.length - (i + 1)];
			series[series.length - (i + 1)] = temp;
		}
		for(int i=0; i<series.length;i++) {
			System.out.print(" "+series[i]+" ");
		}

		// dizideki elemanları sondan başa yazırma.
//		for (int i = 0; i < series.length; i++) {
//			System.out.println((i + 1) + " " + series[series.length - i - 1]);
//		}

		// bu dizideki elemanların yerlerini değiştirin.


		for (int i = 0; i < series.length / 2; i++) {
			if (series[i] == series[series.length - (i + 1)]);

			temp = series[i];
			series[i] = series[series.length - (i + 1)];
			series[series.length - (i + 1)] = temp;
		}

	}

}
