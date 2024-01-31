package alistirmalar;

import java.util.Scanner;

public class PolindromikAsalBulma {

	public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.println("sayi griniz");
    int sayi=input.nextInt();
     System.out.println(Asal(sayi));   
     if(Asal(sayi)==true && Polindrom(sayi)==true) {
    	 System.out.println("polindromik asaldýr");
     }
     else {
    	 System.out.println("polindromik aasal deðildir");
     }
     
     
     
     
	}
	public static boolean Asal(int sayi) {
		int sayac=0;
		for(int i=2;i<sayi;i++) {
			if(sayi%i==0) {
				sayac++;
			}
		}
		if(sayac==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static boolean Polindrom(int sayi) {
		 int tmp,kalan,sonuc=0;
		 tmp=sayi;
		 while(tmp!=0) {
			 kalan=tmp %10;
			 sonuc=sonuc*10+kalan;
			 tmp= tmp /10;
		 }
		 if(sayi==sonuc) {
			 return true;
		 }
		 else {
			 return false;
		 }
		
	}

}
