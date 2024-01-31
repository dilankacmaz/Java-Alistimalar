package alistirmalar;

import java.util.Scanner;

public class ToplamaYap {
//dizideki elemanlarýn toplamýný bul ve 13 olursa eðer 13 ve 13ten sonraki sayýyý toplama iþlemine katma.
	
	public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Dizinin boyutunu giriniz: ");
    int diziuzunluk=input.nextInt();
    int []dizi=new int [diziuzunluk];
    
    for(int i=0;i<dizi.length;i++) {
    	System.out.println("dizinin "+i+" , elmanýný giriniz: ");
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
