package alistirmalar;

import java.util.Scanner;
// girilen ismin sesli ve sesiz hArf say�s�n� bulan prgram
public class SesliSessizHarfSay�s�Bulma {

	public static void main(String[] args) {
     String isim;
     int  sesli=0;
      
     Scanner input=new Scanner(System.in);
     System.out.println("Kelime giriniz: ");
     isim=input.nextLine();
      
     for(int i=0;i<isim.length();i++) {
    	 char a =isim.charAt(i);
    	 if(a=='a' ||a=='e'|| a=='�' || a=='i'|| a=='o' || a=='�' || a=='u' || a=='�') {
    		 sesli++;
    		 
    	 }
    	 
     }
     System.out.println("sesli harf say�s�: "+sesli);
     System.out.println("sessiz harf say�s�: " +( isim.length()-sesli));
     
	}

}
