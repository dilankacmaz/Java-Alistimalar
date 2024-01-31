package alistirmalar;

import java.util.Scanner;

public class ÜçArdýþýkSayýTrue {
//arka arkaya 3 tane ardýþýk sayý varsa true döndür yoksa false döndür
	
	public static void main(String[] args) {
 Scanner input=new Scanner(System.in) ;
	 System.out.println("DÝZÝNÝN BOYUTUNU GÝRÝNÝZ:");
	 int diziuzunluk=input.nextInt();
	 int []dizi=new int[diziuzunluk];
	 
	 for(int i=0;i<dizi.length;i++) {
		 System.out.println("dizinin "+i+" . elemanýný giriniz: ");
		 dizi[i]=input.nextInt();
		 
	 }
        for(int i=0;i<dizi.length;i++) {
        	System.out.println(dizi[i]);
        }
        System.out.println(Metot(dizi));
	}
	public static boolean Metot(int[]dizi) {
		for(int i=0;i<dizi.length-2;i++) {
			if(dizi[i+1]==dizi[i] + 1  &&  dizi[i+2] ==dizi[i+1]+1) {
				return true;
			}
		}
		return false;
	}

}
