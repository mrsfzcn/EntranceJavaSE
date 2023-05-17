package com.emresef.week004;

public class Anahtar {

	String tip;
	int uzunluk;

	Anahtar(String yeniTip, int yeniUzunluk) {
		tip = yeniTip;
		uzunluk = yeniUzunluk;
	}

	Anahtar(String yeniTip) {
		tip = yeniTip;
		uzunluk = 3;
	}

	Anahtar(int yeniUzunluk) {
		tip = "Ev";
		uzunluk = yeniUzunluk;
	}

	Anahtar() {
		tip = "Ev";
		uzunluk = 3;
	}

	void getInfo() {
		System.out.println(tip + " " + uzunluk);
		Anahtar a1 = new Anahtar();
		a1.getInfo();

		Anahtar a2 = new Anahtar();
		a2.getInfo();

		Anahtar a3 = new Anahtar();
		a3.getInfo();

		Anahtar a4 = new Anahtar();
		a4.getInfo();

	}

}
