package alistirmalar;

import java.util.Scanner;

public class ToplamaYap {
//dizideki elemanlar�n toplam�n� bul ve 13 olursa e�er 13 ve 13ten sonraki say�y� toplama i�lemine katma.
	
	public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Dizinin boyutunu giriniz: ");
    int diziuzunluk=input.nextInt();
    int []dizi=new int [diziuzunluk];
    
    for(int i=0;i<dizi.length;i++) {
    	System.out.println("dizinin "+i+" , elman�n� giriniz: ");
    	dizi[i]=input.nextInt();
    }
    
    for(int i=0;i<dizi.length; i++) {
    	System.out.println(dizi[i]);
    }
    System.out.println(Metot(dizi));
		
		
	}
	public static int Metot(int[]dizi) {
		int toplam=0; 
		for(int i=0;i<dizi.length;i++) {
			if(dizi[i]!=13) {
				toplam=toplam+dizi[i];
				
			}
			else {
				i++;
			}
		}
		return toplam;
	}

}
