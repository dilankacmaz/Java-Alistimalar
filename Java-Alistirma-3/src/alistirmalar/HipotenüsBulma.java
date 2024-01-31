package alistirmalar;

import java.util.Scanner;

public class HipotenüsBulma {

	public static void main(String[] args) {
    Scanner input=new Scanner (System.in) ;
    	System.out.println("üçgenin kenara uzunluðunu yazýnýz: ");
    	int kenar1=input.nextInt();
    	System.out.println("üçgenin kenar uzunluðunu giriniz: ");
    	int kenar2=input.nextInt();
    	
    	double hipotenüs= Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
       System.out.println(hipotenüs);
	}

}
