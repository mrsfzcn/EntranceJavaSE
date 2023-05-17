package com.emresef.week002.day03;

public class App04_Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 20;
		double y = 40.5;
		long p = 30;
		float q = 10.60f;

		// int z = x + y; // Cannot convert from double to int
		
		double z=x+y;
		
		// long r = p-q; // Cannot convert from float to long
		
		float r=p-q;
		

	}

}
