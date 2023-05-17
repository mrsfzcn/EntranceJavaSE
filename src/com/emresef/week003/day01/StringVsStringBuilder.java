package com.emresef.week003.day01;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		
		int islemAdet=100000;
		//işlem başlangıç zamanı:
		
		long baslangicZamani=System.currentTimeMillis();
		String metinString="hello";
		for (int i=0; i<islemAdet; i++) {
			metinString+=i;	
		}
		long bitisZamani=System.currentTimeMillis();
		System.out.println("String ile işlem süresi:" + (bitisZamani-baslangicZamani) + "ms");
		/////////////////////////////////////////////////////
		
		//sb.append(i) yöntemi çok daha hızlıdır.
		long baslangicZamani2=System.currentTimeMillis();
		StringBuilder sb=new StringBuilder();
		sb.append("hello");
		String metinString2="hello";
		for (int i=0; i<islemAdet; i++) {
			sb.append(i);	
		}
		long bitisZamani2=System.currentTimeMillis();
		System.out.println("String ile işlem süresi:" + (bitisZamani2-baslangicZamani2) + "ms");
		
	}
	
}
