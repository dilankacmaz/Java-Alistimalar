package alistirmalar;

import java.util.Scanner;

public class �iftSay�Say�s�n�Bulma {
//verilen arrayda ka� tane �ift  say� var 
	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("dizinin boyutunu giriniz: ");
    int diziuzunluk= input.nextInt();
    int []dizi= new int [diziuzunluk];
    
    for(int i=0; i<dizi.length;i++) {
    	System.out.println("dizinin "+i+" . elaman�n� giriniz: ");
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
		System.out.print("Ka� tane �ift say� var? : ");
		return sayac;
		
	}
	
}
