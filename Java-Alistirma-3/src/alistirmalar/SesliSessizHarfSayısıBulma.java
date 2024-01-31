package alistirmalar;

import java.util.Scanner;
// girilen ismin sesli ve sesiz hArf sayýsýný bulan prgram
public class SesliSessizHarfSayýsýBulma {

	public static void main(String[] args) {
     String isim;
     int  sesli=0;
      
     Scanner input=new Scanner(System.in);
     System.out.println("Kelime giriniz: ");
     isim=input.nextLine();
      
     for(int i=0;i<isim.length();i++) {
    	 char a =isim.charAt(i);
    	 if(a=='a' ||a=='e'|| a=='ý' || a=='i'|| a=='o' || a=='ö' || a=='u' || a=='ü') {
    		 sesli++;
    		 
    	 }
    	 
     }
     System.out.println("sesli harf sayýsý: "+sesli);
     System.out.println("sessiz harf sayýsý: " +( isim.length()-sesli));
     
	}

}
