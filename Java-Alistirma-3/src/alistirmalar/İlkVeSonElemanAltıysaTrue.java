package alistirmalar;

import java.util.Scanner;

public class �lkVeSonElemanAlt�ysaTrue {
// 6 say�s� arrayin ,llk veya son eleman�ysa true d�nd�ren metod yaz
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
  System.out.println("Dizinin uzunlu�unu giriniz: ");	
  int diziuzunluk= input.nextInt();
  int []numara= new int [diziuzunluk];
  
  
  
  for(int i=0; i< numara.length; i++) {
	  System.out.println("dizinin "+ i+" . elaman�n� giriniz: ");
	  numara[i]=input.nextInt();
  }
  
  
  for(int i=0; i<numara.length; i++) {
	  System.out.println(numara[i]);
  }

  System.out.println(alt�(numara));
  
   
	}
	public static boolean alt�(int []numara) {
		if(numara[0]==6 || numara[numara.length-1]==6) {
        return true;			
		}
		else {
			return false;
		}
	}

}
