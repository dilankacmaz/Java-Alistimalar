package alistirmalar;

import java.util.Scanner;

public class �lk�kiElemanToplama {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("dizinin uzunlu�unu giriniz: ");
    int diziuzunluk=input.nextInt();
    int []dizi=new int [diziuzunluk];
    
    for(int i=0;i <dizi.length;i++) {
    	System.out.println("dizinin "+i+" . elamn�n� giriniz : ");
    	dizi[i]=input.nextInt();
    	
    			
    }
    for(int i=0; i< dizi.length; i++) {
    	System.out.println(dizi[i]);
    }
		System.out.println(Metot(dizi));
		
	}
	
	
	public static int Metot(int[]dizi) {
		int toplam=0;
		
		if(dizi.length==0) {
			
             return 0;			
		}
		else if(dizi.length==1) {
			toplam=dizi[0]+toplam;
		}
		else {
			toplam= dizi[0]+dizi[1];
		}
		return toplam;
	}

}
