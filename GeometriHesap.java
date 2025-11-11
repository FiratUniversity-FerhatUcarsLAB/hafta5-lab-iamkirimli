/*
 * Ad Soyad: Mehmet Ali Kırımlı
 * Ogrenci No: 250542027
 * Tarih: 11.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class odev_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Kare İçin İşlemler
		System.out.print("Kare'nin bir kenar uzunluğunu giriniz: ");
		double kare_kenar = scanner.nextDouble();
		kare_cevre_alan_hesaplama(kare_kenar); //Geriye Değer Döndürmeyen Kare Alan ve Çevhre Hesaplayan Parametreli Metot
		
		//Dikdörtgen İçin İşlemler
		System.out.print("Dikdörtgenin'nin kısa kenar uzunluğunu giriniz: ");
		double dikdortgen_kisa_kenar = scanner.nextDouble();
		System.out.print("Dikdörtgenin'nin uzun kenar uzunluğunu giriniz: ");
		double dikdortgen_uzun_kenar = scanner.nextDouble();
		dikdortgen_cevre_alan_hesaplama(dikdortgen_kisa_kenar, dikdortgen_uzun_kenar); //Geriye Değer Döndürmeyen Dikdörtgen Alan ve Çevhre Hesaplayan Parametreli Metot
		
		//Daire İçin İşlemler
		System.out.print("Daire'nin yarıçapını giriniz: ");
		double daire_yaricap = scanner.nextDouble();
		daire_cevre_alan_hesaplama(daire_yaricap); //Geriye Değer Döndürmeyen Daire Alan ve Çevhre Hesaplayan Parametreli Metot
		
		//Üçgen İçin İşlemler
		System.out.print("Üçgenin 1. kenar uzunluğunu giriniz: ");
		double kenar_a = scanner.nextDouble();
		System.out.print("Üçgenin 2. kenar uzunluğunu giriniz: ");
		double kenar_b = scanner.nextDouble();
		System.out.print("Üçgenin 3. kenar uzunluğunu giriniz: ");
		double kenar_c = scanner.nextDouble();
		ucgen_cevre_alan_hesaplama(kenar_a, kenar_b, kenar_c); //Geriye Değer Döndürmeyen Üçgen Alan ve Çevhre Hesaplayan Parametreli Metot
		
		scanner.close();
		
	}
	
	//Karenin Çevresini ve Alanını Hesaplayan Metot
	public static void kare_cevre_alan_hesaplama(double cevre) {
		double karenin_cevresi = cevre*4;
		double karenin_alani = cevre*cevre;
		System.out.println("");
		System.out.println("=============================");
		System.out.printf("Karenin Çevresi:  %.2f \n", karenin_cevresi);
		System.out.printf("Karenin Alanı:  %.2f \n", karenin_alani);
		System.out.println("");
	}
	
	//Dikdörtgenin Çevresini ve Alanını Hesaplayan Metot
	public static void dikdortgen_cevre_alan_hesaplama(double kisa_kenar, double uzun_kenar) {
		double dikdortgen_cevre = (kisa_kenar+uzun_kenar)*2;
		double dikdortgen_alan = kisa_kenar*uzun_kenar;
		System.out.println("");
		System.out.println("=============================");
		System.out.printf("Dikdörtgenin Çevresi:  %.2f \n", dikdortgen_cevre);
		System.out.printf("Dikdörtgenin Alanı:  %.2f \n", dikdortgen_alan);
		System.out.println("");
	}
	
	//Dairenin Çevresini ve Alanını Hesaplayan Metot
	public static void daire_cevre_alan_hesaplama(double yaricap) {
		double daire_cevre = 2*Math.PI*yaricap;
		double daire_alan = Math.PI*(yaricap*yaricap);
		System.out.println("");
		System.out.println("=============================");
		System.out.printf("Dairenin Çevresi: %.2f \n", daire_cevre);
		System.out.printf("Dairenin Alanı: %.2f \n", daire_alan);
		System.out.println("");
	}
	
	//Üçgenin Çevresini ve Alanını Hesaplayan Metot
	public static void ucgen_cevre_alan_hesaplama(double kenar_a, double kenar_b, double kenar_c) {
		double ucgen_cevre = kenar_a+kenar_b+kenar_c;
		double s = ucgen_cevre/2;
		double ucgen_alan = Math.sqrt(s*(s*kenar_a)*(s*kenar_b)*(s*kenar_c));
		System.out.println("");
		System.out.println("=============================");
		System.out.printf("Üçgenin Çevresi:  %.2f \n", ucgen_cevre);
		System.out.printf("Üçgenin Alanı:  %.2f \n", ucgen_alan);
		System.out.println("");
	}
	
}
