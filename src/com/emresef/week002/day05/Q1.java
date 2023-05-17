package com.emresef.week002.day05;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int satir, sutun;
		char karakter='*';
		
		System.out.println("Satir sayisini giriniz.");
		satir= sc.nextInt();
		
//		System.out.println("Sutun sayisini giriniz.");
//		sutun= sc.nextInt();
//		for(int i=0; i<satir; i++) {
//			for(int j=0; j<sutun; j++) {
//				System.out.print(karakter);
//			}
//			System.out.println();
//		}
	
		for(int i=0; i<satir; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(karakter);
			}
			System.out.println();
		
	
		}
	
	}	

}
