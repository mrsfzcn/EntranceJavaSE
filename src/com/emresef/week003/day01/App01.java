package com.emresef.week003.day01;

public class App01 {

	public static void main(String[] args) {
		
		String ad = new String("Java");
		String ad2 = new String("Java");

		if (ad == ad2) {
			System.out.println("New ile aynı String == kontrol edilince nesneler EŞİT");
		} else {
			// new ile farklı nesneler olarak olusturulduug için bu kısım çalışır.
			System.out.println("New ile aynı String == ile kontrol edilince EŞİT DEĞİL");
		}

		String soyadString = "Özcan";
		String soyadString2 = "Özcan";
		// Havuzdaki aynı nesneyi refere ettikleri için burası çalışır
		if (soyadString == soyadString2) {
			System.out.println("Çift tırnak ile aynı String == kontrol edilince nesneler EŞİT");
		} else {
			System.out.println("Çift tırnak ile aynı String == ile kontrol edilince EŞİT DEĞİL");
		}

		if (soyadString.equals(soyadString2)) {
			// Havı-uzdaki aynı nesneyi refere ettikleri için burası çalışır.
			// equals içeri kontrolü yaptıgı için burası çalısır.
			System.out.println("equals ile aynı String == kontrol edilince nesneler EŞİT");
		} else {
			System.out.println("equals ile aynı String == ile kontrol edilince EŞİT DEĞİL");
		}

		// charAt Sorusu:
		// Türkçe alfabedeki büyük harflerin ASCII karşılığını yazınız.
		// A harfi: 65.

		String alfabeString = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";

		for (int i = 0; i < alfabeString.length(); i++) {
			int ascii = alfabeString.charAt(i);
			System.out.println(alfabeString.charAt(i) + " harfi : " + ascii);
		}
						//  01234567891011 : Toplam 12 index var.
		String mesajString="Merhaba Java";
		String altString=mesajString.substring(8,11);
		//8. indexten başlayıp 11. indexe kadar yazdıracaktır.
		//8. indexten başlayıp sonuna kadar gitmesi için virgül ve sonrası iptal edilir.
		System.out.println(altString);
		System.out.println(" \"\" Escape Karakter ile basılamayan karakteri bastım");
		//Basılamayan karakterleri Karakter ile basarsın \ \
		System.out.println("\t Alternatif");
		System.out.println("Alter \n natif \t alternatif3 ");
		
		////////////////////////////////////
		
		String str1="Ahmet";
		String str2="Zeynep";
		
		int sonuc= str1.compareTo(str2); 
		//Sonuc negatif çünkü A ascii:65 iken Z:90 = A-Z=65-90= -25
		//Eğer ilk harfler aynı ise 2. harfleri kontrol eder.
		System.out.println("sonuc: "+ sonuc);
		
		//////////////////////////////////////////
		String Str5="Emre";
		String Str6="emre";
		
		if (Str5.equalsIgnoreCase(Str6)) {
			System.out.println("Stringler eşittir.");
		}
		else {
			System.out.println("Stringler eşit değil.");
		}
		
		String Str7=Str6.replace('m', 'e');
		//m karakterini e karakteri ile değiştirir. m yerine e basar.
		System.out.println(Str7);
		
		///////////////////////
		
		boolean jileBasladiMi=str1.startsWith("i");
		System.out.println(jileBasladiMi);
		
	}

}
