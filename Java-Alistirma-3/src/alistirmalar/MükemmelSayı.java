package alistirmalar;

import java.util.Scanner;

public class M�kemmelSay� {

	public static void main(String[] args) {
             Scanner input=new Scanner (System.in);
             System.out.println("say� giriniz: ");
             int sayi=input.nextInt();
             int  toplam=0;
             for(int i=1;i<sayi;i++) {
            	 if(sayi%i==0) {
            		 toplam=toplam+i;
            		 
            	 }
             }
             if(toplam==sayi) {
            	 System.out.println("m�kemmel say�d�r.");
             }
             else {
            	 System.out.println("m�kemmel say� de�ildir");
             }

	}

}
