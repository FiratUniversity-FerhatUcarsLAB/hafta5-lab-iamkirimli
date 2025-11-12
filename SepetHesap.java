/*
 * Ad Soyad: Mehmet Ali KIRIMLI
 * Ogrenci No: 250542027
 * Tarih: 13.11.2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class odev_03 {

	//KDV ve Kargo Ücretini değişmeyecek değişken halinde static olarak atıyoruz.
	public static final double KDV = 0.18;
	public static final double kargoUcreti = 29.99;
	
	//Ürün 1 için fiyat ve adet hesaplaması yapan fonksiyon.
	public static double urun1Hesapla(double fiyat, int adet) {
		double toplamFiyat = fiyat*adet;
		return toplamFiyat;
	}
	
	//Ürün 2 için fiyat ve adet hesaplaması yapan fonksiyon.
	public static double urun2Hesapla(double fiyat, int adet) {
		double toplamFiyat = fiyat*adet;
		return toplamFiyat;
	}
	
	//Ürün 3 için fiyat ve adet hesaplaması yapan fonksiyon.
	public static double urun3Hesapla(double fiyat, int adet) {
		double toplamFiyat = fiyat*adet;
		return toplamFiyat;
	}
	
	//İndirim miktarını hesaplayan fonksiyon.
	public static double indirimMiktar(double indirim, double toplam) {
		indirim = indirim*0.01;
		double indirimMiktar = toplam*indirim;
		return indirimMiktar;
	}
	
	//İndirimli fiyatı hesaplayan fonksiyon.
	public static double indirimliHesapla(double indirimMiktar, double toplam) {
		double indirimliFiyat = toplam-indirimMiktar;
		return indirimliFiyat;
	}
	
	//İndirimli fiyat üzerinden KDV tutarını hesaplayan fonksiyon.
	public static double kdvUcret(double toplamFiyat) {
		double kdvUcret = toplamFiyat*KDV;
		return kdvUcret;
	}
	
	
	//Ürünlerin sonuçta ödenecek fiyatını hesaplayan fonksiyon.
	public static double genelToplam(double indirimliFiyat, double kdvUcret) {
		double genelToplam = indirimliFiyat + kdvUcret + kargoUcreti;
		return genelToplam;
	}
	
	public static void main(String[] args) {
		
		//Scanner kod bloğu.
		Scanner scanner = new Scanner(System.in);
		
		//Kullanıcıdan değerleri aldığımız kod bloğu.
		System.out.println("===E-TİCARET SEPET HESAPLAYICI===");
		System.out.println("\nLütfen 3 Ürünün Bilgilerini Girin");
		
		System.out.println("Ürün 1:");
		System.out.print(" Birim Fiyatı: ");
		double price1 = scanner.nextDouble();
		System.out.print(" Adet: ");
		int piece1 = scanner.nextInt();
		
		System.out.println("\nÜrün 2:");
		System.out.print(" Birim Fiyatı: ");
		double price2 = scanner.nextDouble();
		System.out.print(" Adet: ");
		int piece2 = scanner.nextInt();
		
		System.out.println("\nÜrün 3:");
		System.out.print(" Birim Fiyatı: ");
		double price3 = scanner.nextDouble();
		System.out.print(" Adet: ");
		int piece3 = scanner.nextInt();
		
		System.out.print("\nİndirim Kuponu Yüzdesi (%): ");
		double discountPer = scanner.nextDouble();
		
		//Ürün adet ve fiyatlarının çarpım değerlerini değişkenlere atama.
		double urun1Toplam = urun1Hesapla(price1, piece1);
		double urun2Toplam = urun2Hesapla(price2, piece2);
		double urun3Toplam = urun3Hesapla(price3, piece3);
		
		//Ürünlerin kdv, indirim, kargo ücretlerini hesaplayıp işleyen kod bloğu.
		double araToplam = urun1Toplam+urun2Toplam+urun3Toplam;
		double indirimMiktar = indirimMiktar(discountPer, araToplam);
		double indirimliFiyat = indirimliHesapla(indirimMiktar, araToplam);
		double kdvUcreti = kdvUcret(indirimliFiyat);
		double genelToplam = genelToplam(indirimliFiyat, kdvUcreti);
		
		
		//Kullanıcıya bilgilerin yazdırıldığı kod bloğu.
		System.out.println("\n========================================");
        System.out.println("           SİPARİŞ ÖZETİ");
        System.out.println("========================================");
        
        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", price1, piece1, urun1Toplam);
        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", price2, piece2, urun2Toplam);
        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", price3, piece3, urun3Toplam);
        
        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                   : %.2f TL\n", araToplam);
        
        System.out.printf("\nIndirim Tutari (%%%.0f)         : -%.2f TL\n", discountPer, indirimMiktar);
        System.out.printf("Indirimli Toplam             : %.2f TL\n", indirimliFiyat);

        System.out.printf("\nKDV Tutari (%%%.0f)             : +%.2f TL\n", (KDV * 100), kdvUcreti);
        System.out.printf("Kargo Ucreti                 : +%.2f TL\n", kargoUcreti);
        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM                 : %.2f TL\n", genelToplam);
        System.out.println("========================================");
        
        scanner.close();
		
	}

}
