package alistirmalar;

import java.util.Scanner;

public class HarfSayýsýHesaplama {

	public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
     System.out.println("kelime giriniz: ");
     String kelime = input.nextLine();
    System.out.println(Metot(kelime));
     
    

}
	 public static int  Metot(String kelime) {
		 int harf=0;
		for(int i=0;i<kelime.length();i++) {
			harf++;
			
		}
		return harf;
	 }
}