package alistirmalar;

import java.util.Random;
import java.util.Scanner;

public class RandomMatrisOlusturma {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	System.out.println(" sayýsýný giriniz: ");
	int n =input.nextInt();
	Metot(n);
	   }
	
	public static void  Metot(int n) {
		Random rastgele=new Random();
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
			int sayi=rastgele.nextInt(2);
                System.out.print(sayi+" ");

			}

			System.out.println();

		}
		
	}
}
