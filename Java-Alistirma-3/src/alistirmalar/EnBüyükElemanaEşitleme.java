package alistirmalar;

import java.util.Arrays;
import java.util.Scanner;

public class EnB�y�kElemanaE�itleme {
//dizinin en b�y�k elman�n� bul ve dizinin t�m elmanlar�n� en b�y�k elmana e�itle
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("dizi uzunlu�u giriniz: ");
		int diziUzunluk=input.nextInt();
		int []numara=new int [diziUzunluk];
		
		for(int i=0;i<numara.length;i++) {
			System.out.println("dizinin "+i+". index elaman�n� giriniz: ");
			numara[i]=input.nextInt();
			
		}
		
		for(int i=0;i< numara.length;i++) {
			System.out.println(numara[i]);
		}
		
		System.out.println(Arrays.toString(Max(numara)));
		

	}
	 
	public static int[] Max(int[]numara){
		int max =0;
		for(int i=0;i<numara.length;i++) {
			if(numara[i]>max) {
				max=numara[i];
				
			}
		}
		for (int i=0;i<numara.length;i++) {
			numara[i]=max;
		}
		return numara;
		
		
       
		
	}

}
