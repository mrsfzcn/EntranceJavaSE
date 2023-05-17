package com.emresef.week002.day04;

import java.util.Scanner;

public class Do_While_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int sum = 0;
		int num;
		
		do {

			System.out.print("Bir num giriniz, sonuc icin 0'a basiniz.");
			
			num = input.nextInt(); 
			//Bu tanım dış blokta yazılırsa sonsuz döngüye girer.
			
			sum += num;

		} 
		while (num != 0); //DO-WHILE NOKTALI VIRGUL DIKKAT.

		System.out.println("sum: " +sum);

	}

}
