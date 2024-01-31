package alistirmalar;

import java.util.Scanner;

public class MükemmelSayý {

	public static void main(String[] args) {
             Scanner input=new Scanner (System.in);
             System.out.println("sayý giriniz: ");
             int sayi=input.nextInt();
             int  toplam=0;
             for(int i=1;i<sayi;i++) {
            	 if(sayi%i==0) {
            		 toplam=toplam+i;
            		 
            	 }
             }
             if(toplam==sayi) {
            	 System.out.println("mükemmel sayýdýr.");
             }
             else {
            	 System.out.println("mükemmel sayý deðildir");
             }

	}

}
