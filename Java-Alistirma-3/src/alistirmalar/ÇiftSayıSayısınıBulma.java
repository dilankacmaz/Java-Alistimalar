package alistirmalar;

import java.util.Scanner;

public class ÇiftSayıSayısınıBulma {
//verilen arrayda kaç tane çift  sayı var 
	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("dizinin boyutunu giriniz: ");
    int diziuzunluk= input.nextInt();
    int []dizi= new int [diziuzunluk];
    
    for(int i=0; i<dizi.length;i++) {
    	System.out.println("dizinin "+i+" . elamanını giriniz: ");
        dizi[i]= input.nextInt();   	
    }
    
    
    System.out.println(Metot(dizi));
	}
	
	public static int Metot(int[] dizi) {
		int sayac=0;
		
		for(int i=0; i<dizi.length;i++) {
			if(dizi[i]%2==0) {
				sayac++;
			}
			
			
		}
		System.out.print("Kaç tane çift sayı var? : ");
		return sayac;
		
	}
	
}
