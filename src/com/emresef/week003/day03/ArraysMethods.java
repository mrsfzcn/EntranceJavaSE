package com.emresef.week003.day03;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		
		int [] sayilar= {5,1,3,2,4};
		String[] iller= {"ankara", "kars", "izmir", "konya"};
		
		//Diziyi sıralı hale getirme:
		Arrays.sort(sayilar);
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i]);
		}
		
		Arrays.sort(iller);
		for (int i = 0; i < iller.length; i++) {
			System.out.println(iller[i]);
		}
		
		//Eleman arama:
		int index = Arrays.binarySearch(sayilar,2); //2yi arıyoruz
		if (index>0) {System.out.println("Eleman bulundu");}
		else System.out.println("Eleman bulunamadı.");		
		System.out.println(index);	//2 şuan 1. indextedir.
		
		//Dizileri karşılaştırma:
		int[] array1= {0,1,2};
		int[] array2= {1,0,2};
		boolean esitMi=Arrays.equals(array1, array2);
		
		//Diziyi doldurma:
		int[] array3= new int[10];
		Arrays.fill(array3,1); //array 3 ü Belirlenen eleman 1 ile dolduracak.
		System.out.println(Arrays.toString(array3));
		
		//Diziden baştan belirli indexe kadar kopyalama
		int [] sayilar2= {5,1,3,2,4};
		int [] sayilar2Kopya= Arrays.copyOf(sayilar2,4);
		System.out.println(Arrays.toString(sayilar2Kopya));		//toString metodu ile for u egale ediyoruz.
		
		//Diziden belirlenen indexler arası kopyalama:
		int[] sayilar3= {5,1,3,2,4};
		int[] sayilar3Kopya=Arrays.copyOfRange(sayilar3, 1, 5); //Virgül sonrası dahil edilmez
		System.out.println(Arrays.toString(sayilar3Kopya));
		
		//Stream ile diziyi akışa çevirip istediğimiz işlemi yaptırabiliriz.
		//Arrays.stream(sayilar4). bastıgında seçenekler çıkar.
		int[] sayilar4= {5,1,3,2,4};
		int toplam=Arrays.stream(sayilar4).sum();
		System.out.println(toplam);
	}

}
