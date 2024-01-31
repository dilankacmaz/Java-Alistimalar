package alistirmalar;

import java.util.Scanner;

public class BölenleriniBulma {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int sayi;
    while(true) {
    System.out.println("sayi giriniz: ");
    sayi=input.nextInt();
    if(sayi>=0) {
    for(int i=1;i<=sayi;i++) {
    	if(sayi%i==0 && sayi>=0) {
    		System.out.print(" "+i);
    		
    	}
    	
    }
    break;
	}
    else{
    	System.out.println("pozitif sayi giriniz");
    	
    	continue;
    }

}}}
