package alistirmalar;

import java.util.Scanner;

public class YanYana›kiGelirseTrue {

	public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.println(" dizinin boyutunu giriniz: ");
   int diziuzunluk=input.nextInt();
   int []dizi=new int [diziuzunluk];
   
   for(int i=0;i<dizi.length;i++) {
	   System.out.println("dizinin "+i+" . elman˝n˝ giriniz: ");
	   dizi[i]=input.nextInt();
	   
   }
   for(int i=0; i<dizi.length; i++) {
	   System.out.println(dizi[i]);
   }
   System.out.println(Metot(dizi));
	}

	
	public static boolean Metot(int[]dizi) {
		for(int i=0;i<dizi.length-1;i++) {
		if(dizi[i]==2 && dizi[i+1]==2) {
			return true;
		}
		
			
		}
		return false;
	}
}
