package alistirmalar;

import java.util.Scanner;

public class DenklemK�k�Bulma {

	public static void main(String[] args) {
    // ax2+bx+c=0
		Scanner input=new Scanner(System.in);
		System.out.println("a de�erini giriniz: ");
		double a=input.nextInt();
		System.out.println("b de�erini giriniz: ");
		double b =input.nextInt();
		System.out.println("c de�erini giriniz: ");
		double c =input.nextInt();
		double delta= b*b-(4*a*c);

		if(delta>0) {
		double birincikok= (-b + Math.sqrt(delta))/(2*a);
		double ikincikok= -birincikok;
		
		System.out.println(birincikok+"   "+ ikincikok) ;
		}
		else if(delta==0) {
			double birincikok= (-b + Math.sqrt(delta))/(2*a);
            double ikincikok= birincikok;
    		System.out.println(birincikok+"   "+ ikincikok) ;

		}
		else {
			System.out.println("denklemin k�k� yoktur");
		}
		
	}

}
