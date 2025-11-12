/*
 * Ad Soyad: Mehmet Ali Kırımlı
 * Ogrenci No: 250542027
 * Tarih: 13.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class odev_02 {
	
	//Değiştirilemez gravity değişkenimiz.
	public static final double gravity = 9.81;
	
	//Hız Hesaplama Fonksiyonu (V = s/t)
	public static double hizHesaplama(double alinanYol, double time) {
		double hiz = alinanYol/time;
		return hiz;
	}
	
	//İvme Hesaplama Fonksiyonu (a = Delta V / Delta t)
	public static double ivmeHesaplama(double deltaV, double time) {
		double ivme = deltaV/time;
		return ivme;
	}
	
	//Kuvvet Hesaplama Fonksiyonu (F = m*a)
	public static double kuvvetHesaplama(double kutle, double ivme) {
		double kuvvet = kutle * ivme;
		return kuvvet;
	}
	
	//İş Hesaplama Fonksiyonu (W = F*d)
	public static double isHesaplama(double F, double distance) {
		double work = F*distance;
		return work;
	}
	
	//Güç Hesaplama Fonksiyonu (P = W/t)
	public static double gucHesaplama(double watt, double time) {
		double power = watt/time;
		return power;
	}
	
	//Kinetik Enerji Hesaplama Fonksiyonu (KE = 1/2*m*v^2)
	public static double kinetikHesaplama(double kutle, double hiz) {
		double KE = 1/2*(kutle*(hiz*hiz));
		return KE;
	}
	
	//Potansiyel Enerji Hesaplama Fonksiyonu (PE = m*g*h)
	public static double potansiyelHesaplama(double kutle, double height) {
		double PE = kutle*gravity*height;
		return PE;
	}
	
	//Momentum Hesaplama Fonksiyonu (P=m*v)
	public static double momentumHesaplama(double kutle, double hiz) {
		double momentum = kutle*hiz;
		return momentum;
	}
	
	public static void main(String[] args) {
		
		//Scanner Kod Bloğu
		Scanner scanner = new Scanner(System.in);
		
		//Kullanıcıdan gerekli değerleri aldığımız kod bloğu
		System.out.println("=== FIZIK FORMUL ASISTANI ===");
        System.out.println();
        
        System.out.println("Temel Ölçümler:");
        
        System.out.print("Kütle (kg): ");
        double kutle = scanner.nextDouble();
        
        System.out.print("Mesafe (m): ");
        double distance = scanner.nextDouble();
        
        System.out.print("Zaman (s): ");
        double time = scanner.nextDouble();
        
        System.out.print("Hız Değişimi (m/s): ");
        double deltaV = scanner.nextDouble();
        
        System.out.print("Yükseklik (m): ");
        double height = scanner.nextDouble();
        
        
		
		//Ekrana yazdıracağımız hesaplama sonuçlarının fonksiyonlar ile değişkenlere return atılan kod bloğu
		double hiz = hizHesaplama(distance, time);
		double ivme = ivmeHesaplama(deltaV, time);
		double kuvvet = kuvvetHesaplama(kutle, ivme);
		double is = isHesaplama(kuvvet, distance);
		double guc = gucHesaplama(is, time);
		double kinetik = kinetikHesaplama(kutle, hiz);
		double potansiyel = potansiyelHesaplama(kutle, height);
		double momentum = momentumHesaplama(kutle, hiz);
		
		//Ekrana sonuçları yazdıracağımız kod bloğu
		System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        
        System.out.println("\nHIZ ve HAREKET");
		System.out.printf(" Hiz (v = s/t) %.2f m/s", hiz);
		System.out.printf("\n İvme (a = Δv/t) %.2f m/s²", ivme);
		
		System.out.println("\n\nKUVVET ve İŞ");
		System.out.printf(" Kuvvet (F = m*a) %.2f N", kuvvet);
		System.out.printf("\n İş (W = F*d) %.2f J", is);
		System.out.printf("\n Güç (P = W/t) %.2f J", guc);
		
		System.out.println("\n\nENERJİ");
		System.out.printf(" Kinetik Enerji (KE = 0.5 * m * v²) %.2f J", kinetik);
		System.out.printf("\n Potansiyel Enerji (PE = m * g * h) %.2f J", potansiyel);
		System.out.printf("\n Toplam Enerji %.2f J", kinetik+potansiyel);
		
		System.out.println("\n\nMOMENTUM");
        System.out.printf(" Momentum (p = m*v) %.2f kg·m/s", momentum);
        
        System.out.println("\n\n========================================");

		scanner.close();
		
	}
}
