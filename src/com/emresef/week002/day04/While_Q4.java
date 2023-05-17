package com.emresef.week002.day04;

import java.util.Scanner;

public class While_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// length() : uzunlugu verir
		// charAt(index) : verilen indexteki karakteri alır.
		// equals : esitlik konrolü için kullanılır.
		
		// if(sifre.equals(sifreKontrol))
		
		//Soru: Kullanıcının girdiği kelime tersiyle aynı mı değil mi?
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Bir kelime giriniz.");
		String kelime =sc.next();
		String kelimeTers="";
		
		
		int i=kelime.length()-1;
		
		while(i>=0) {
			//012345
			//deneme
			kelimeTers+=kelime.charAt(i);
			i--;
			
		}
		System.out.println(kelimeTers);
	}

}
