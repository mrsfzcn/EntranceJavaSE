package com.emresef.week002.day02;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class App02 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int a, b;
		System.out.println("A= ");
		a = input.nextInt();
		System.out.println("B= ");
		b = input.nextInt();
		int toplam = a + b;
		int cikar = a - b;
		int carp = a * b;
		int bol = a / b;
		
			if (a>b) {
				System.out.println("Toplam= " + toplam);
				
		input.close();	
		}
		System.out.println("Cikar= " + cikar);
		
		
				

		// sysout(ctrl_space)--> System.out.println <--shortcut
	}

}
