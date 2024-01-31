package alistirmalar;

import java.util.Arrays;
import java.util.Scanner;

public class EnBüyükElemanaEþitleme {
//dizinin en büyük elmanýný bul ve dizinin tüm elmanlarýný en büyük elmana eþitle
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("dizi uzunluðu giriniz: ");
		int diziUzunluk=input.nextInt();
		int []numara=new int [diziUzunluk];
		
		for(int i=0;i<numara.length;i++) {
			System.out.println("dizinin "+i+". index elamanýný giriniz: ");
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
