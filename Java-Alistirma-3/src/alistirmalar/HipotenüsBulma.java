package alistirmalar;

import java.util.Scanner;

public class Hipoten�sBulma {

	public static void main(String[] args) {
    Scanner input=new Scanner (System.in) ;
    	System.out.println("��genin kenara uzunlu�unu yaz�n�z: ");
    	int kenar1=input.nextInt();
    	System.out.println("��genin kenar uzunlu�unu giriniz: ");
    	int kenar2=input.nextInt();
    	
    	double hipoten�s= Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
       System.out.println(hipoten�s);
	}

}
