package alistirmalar;


import java.util.Scanner;

public class OrtalamaHesaplama {
// en b�y�k ve en  k���k de�eri g�zard� ederek ortalama hesaplama
	
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in );
		System.out.println("dizinin boyutunu giriniz: ");
		int diziuzunluk=input.nextInt();
		int []dizi=new int [diziuzunluk];
		
		for(int i=0;i<dizi.length; i++) {
			System.out.println("dizinin "+i+" . eleman�n� giriniz: ");
			dizi[i]=input.nextInt();
		}
         
		for(int i=0; i<dizi.length;i++) {
			System.out.println(dizi[i]);
		}
		System.out.println(Metot(dizi));
	}
	
	public static double Metot(int[]dizi) {
		int toplam=0;
		int min = dizi[0];
		int max= dizi[0];
		for(int i=0; i<dizi.length;i++) {
			toplam=toplam+ dizi[i];
			
			min=Math.min(min, dizi[i]);
			max=Math.max(max,dizi[ i]);
			
		}
		return (toplam -(min+max))/(dizi.length-2) ;
	}

}
