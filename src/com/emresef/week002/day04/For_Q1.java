package com.emresef.week002.day04;

public class For_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		1-10 arası sayıları yazdırın.
//		
//		for(int i =1; i<= 10; i++) {
//			System.out.println(i);
//		
//		1-10 arası çift sayıları yazdırın.
//		
//		for(int i =0; i<= 10; i+=2) {
//			System.out.println(i);	
			
		for(int i =1; i<= 100; i++) {
			if (i%15==0) {
				System.out.println(i+" 15KAT");
				
			}else if (i%5==0) {
				System.out.println(i+" 5KAT");
				
			}else if (i%3==0) {
				System.out.println(i+ " 3KAT");
			}else {
				System.out.println(i);
			}
		}

	}

}
