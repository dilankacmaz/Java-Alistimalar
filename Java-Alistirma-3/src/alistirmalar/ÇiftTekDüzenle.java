package alistirmalar;

import java.util.Arrays;
import java.util.Scanner;

public class ÇiftTekDüzenle {
//  çift ve tek sayýlarý düzenle . çift sayýlar tek sayýlardan önce gelsin
	
	public static void main(String[] args) {
  Scanner input=new Scanner (System.in);
  System.out.println("dizi uzunluðunu giriniz: ");
  int diziuzunluk= input.nextInt();
  int []dizi=new int [diziuzunluk];
  
  for(int i=0;i<dizi.length;i++) {
	  System.out.println("dizinin "+i+". elemanýný giriniz: ");
	  dizi[i]=input.nextInt();
	  
  }
  for(int i=0; i<dizi.length;i++) {
	  System.out.println(dizi[i]);
  }
  System.out.println(Arrays.toString(Metot(dizi)));
  
	}
	public static int[] Metot(int[]dizi) {
		
		int []sonuc =new int [dizi.length];
		int baslangýç=0;
		int son= dizi.length-1;
		
		for(int i=0;i<dizi.length; i++) {
			if(dizi[i]%2==0) {
				sonuc[baslangýç]=dizi[i];
				baslangýç++;
			}
			else {
				sonuc[son]=dizi[i];
				son--;
			}
		}
		return sonuc;
	}

}
