package alistirmalar;

import java.util.Scanner;

public class ÝlkVeSonElemanAltýysaTrue {
// 6 sayýsý arrayin ,llk veya son elemanýysa true döndüren metod yaz
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
  System.out.println("Dizinin uzunluðunu giriniz: ");	
  int diziuzunluk= input.nextInt();
  int []numara= new int [diziuzunluk];
  
  
  
  for(int i=0; i< numara.length; i++) {
	  System.out.println("dizinin "+ i+" . elamanýný giriniz: ");
	  numara[i]=input.nextInt();
  }
  
  
  for(int i=0; i<numara.length; i++) {
	  System.out.println(numara[i]);
  }

  System.out.println(altý(numara));
  
   
	}
	public static boolean altý(int []numara) {
		if(numara[0]==6 || numara[numara.length-1]==6) {
        return true;			
		}
		else {
			return false;
		}
	}

}
