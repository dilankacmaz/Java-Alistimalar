package alistirmalar;

import java.util.Scanner;

public class ��Ard���kSay�True {
//arka arkaya 3 tane ard���k say� varsa true d�nd�r yoksa false d�nd�r
	
	public static void main(String[] args) {
 Scanner input=new Scanner(System.in) ;
	 System.out.println("D�Z�N�N BOYUTUNU G�R�N�Z:");
	 int diziuzunluk=input.nextInt();
	 int []dizi=new int[diziuzunluk];
	 
	 for(int i=0;i<dizi.length;i++) {
		 System.out.println("dizinin "+i+" . eleman�n� giriniz: ");
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
