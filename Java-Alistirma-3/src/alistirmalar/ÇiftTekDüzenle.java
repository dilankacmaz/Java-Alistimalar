package alistirmalar;

import java.util.Arrays;
import java.util.Scanner;

public class �iftTekD�zenle {
//  �ift ve tek say�lar� d�zenle . �ift say�lar tek say�lardan �nce gelsin
	
	public static void main(String[] args) {
  Scanner input=new Scanner (System.in);
  System.out.println("dizi uzunlu�unu giriniz: ");
  int diziuzunluk= input.nextInt();
  int []dizi=new int [diziuzunluk];
  
  for(int i=0;i<dizi.length;i++) {
	  System.out.println("dizinin "+i+". eleman�n� giriniz: ");
	  dizi[i]=input.nextInt();
	  
  }
  for(int i=0; i<dizi.length;i++) {
	  System.out.println(dizi[i]);
  }
  System.out.println(Arrays.toString(Metot(dizi)));
  
	}
	public static int[] Metot(int[]dizi) {
		
		int []sonuc =new int [dizi.length];
		int baslang��=0;
		int son= dizi.length-1;
		
		for(int i=0;i<dizi.length; i++) {
			if(dizi[i]%2==0) {
				sonuc[baslang��]=dizi[i];
				baslang��++;
			}
			else {
				sonuc[son]=dizi[i];
				son--;
			}
		}
		return sonuc;
	}

}
