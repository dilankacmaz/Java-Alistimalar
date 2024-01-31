package alistirmalar;

import java.util.Scanner;

public class VücutKitleÝndeksi {

	public static void main(String[] args) {
   Scanner input=new Scanner (System.in );
   System.out.println("kilonuzu giriniz:");
		  int kilo=input.nextInt();
   System.out.println("boyunuzu giriniz: ");
   int boy=input.nextInt();
   double vücutkitle=kilo/ (boy*boy);
   if(vücutkitle<18.5) {
	   System.out.println("zayýf");
   }
   else if(18.5 <= vücutkitle && vücutkitle <24.9) {
	   System.out.println("normal");
   }
   else if (24.9<=vücutkitle && vücutkitle<30) {
	   System.out.println("fazla kilolu");
   }
   else if( 30<=vücutkitle && vücutkitle<34.9) {
	   System.out.println("1.dereceden obez");
   }
   else if(34.9<=vücutkitle && vücutkitle<39.9) {
	   System.out.println("2.dereceden obez");
	}
	else {
		System.out.println("3.dereceden obez");
	}

}}
