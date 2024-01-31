package alistirmalar;

import java.util.Scanner;

public class NotOrtalamaHesaplama {

	public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.println(" vize notunuzu giriniz: ");
    int vize= input.nextInt();
    System.out.println("final notunuuzu giriniz: ");
    int finall =input.nextInt();
    int ortalama= (vize*4/10+ finall*6/10);
    if(ortalama>=50) {
    System.out.println("geçtiniz: ");	
    }
    else {
    	System.out.println(" kaldýnýz");
    }
    System.out.println(ortalama);
	}

}
