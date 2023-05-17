package com.emresef.week002.day04;

import java.util.Scanner;

public class App01_Loops_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner (System.in);
		System.out.println("Bir sayı giriniz.");
		
		int sayi= input.nextInt();
		int i=1;
		int faktoryel=1;
		
		while (i<=sayi) {
			faktoryel=faktoryel*i;
			i++;
			
		}
		System.out.println(sayi+ "!=" +faktoryel);
		
	}

}
