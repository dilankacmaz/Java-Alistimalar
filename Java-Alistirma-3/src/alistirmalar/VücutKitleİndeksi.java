package alistirmalar;

import java.util.Scanner;

public class V�cutKitle�ndeksi {

	public static void main(String[] args) {
   Scanner input=new Scanner (System.in );
   System.out.println("kilonuzu giriniz:");
		  int kilo=input.nextInt();
   System.out.println("boyunuzu giriniz: ");
   int boy=input.nextInt();
   double v�cutkitle=kilo/ (boy*boy);
   if(v�cutkitle<18.5) {
	   System.out.println("zay�f");
   }
   else if(18.5 <= v�cutkitle && v�cutkitle <24.9) {
	   System.out.println("normal");
   }
   else if (24.9<=v�cutkitle && v�cutkitle<30) {
	   System.out.println("fazla kilolu");
   }
   else if( 30<=v�cutkitle && v�cutkitle<34.9) {
	   System.out.println("1.dereceden obez");
   }
   else if(34.9<=v�cutkitle && v�cutkitle<39.9) {
	   System.out.println("2.dereceden obez");
	}
	else {
		System.out.println("3.dereceden obez");
	}

}}
