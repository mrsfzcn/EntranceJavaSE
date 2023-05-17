package com.emresef.week002.day05;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ÇARPIM TABLOSU.
		
		int sonuc;
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				sonuc=i*j;
				System.out.println(i+"*"+j+"="+sonuc);
			}
			System.out.println("********");
		}

	}

}
