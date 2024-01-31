package alistirmalar;

import java.util.Scanner;

public class FazlaOlmaDurumu {
//dizideki 1lerin sayýsý 4lerin sayýsýndan fazlaysa true döndür deðilse false döndür
	
	public static void main(String[] args) {
  Scanner input=new Scanner (System.in);
  System.out.println("Dizinin boyutunu griniz: ");
  int diziuzunluk=input.nextInt();
  int []dizi=new int [diziuzunluk];
  
  for(int i=0;i<dizi.length;i++) {
	  System.out.println("Dizinin "+i+". elemanýný giriniz: ");
	  dizi[i]=input.nextInt();
  }
  
  for(int i=0;i<dizi.length;i++) {
	  System.out.println(dizi[i]);
  }
  System.out.println(Metot(dizi));
	}
	
	public static boolean Metot(int[]dizi) {
		int sayac1=0;
		int sayac4=0;
		for(int i=0;i<dizi.length;i++) {
			if(dizi[i]==1) {
				sayac1++;
				
			}
			else if(dizi[i]==4){
				sayac4++;
			}
			
			
		}
		if(sayac1>sayac4) {
			return true;
		}
		return false;
	}

}
