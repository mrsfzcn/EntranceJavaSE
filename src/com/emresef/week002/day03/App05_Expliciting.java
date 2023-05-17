package com.emresef.week002.day03;

public class App05_Expliciting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b;
		int i = 257;
		double d = 323.142;
		System.out.println("int >> byte donusumu");
		b = (byte) i;
		System.out.println("d= " + i + "b= " + b);
		System.out.println("double >> int donusumu");
		i = (int) d;
		System.out.println("d= " + d + "b= " + i);
		System.out.println("double >> byte donusumu");
		b = (byte) d;
		System.out.println("d= " + d + "b= " + i);

	}

}
