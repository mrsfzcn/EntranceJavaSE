package com.emresef.week002.day04;

import java.util.Scanner;

public class While_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int sum = 0;

		while (i < 100) {
			sum += i; 	// sum=sum+i
			i++; 		// i=i+1

		}
		System.out.println("0-100 arasi sayilarin toplami: " + sum);

	}

}
