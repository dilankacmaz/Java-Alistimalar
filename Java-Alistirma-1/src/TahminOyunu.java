import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {

	public static void main(String[] args) {
int tahmin , hak=5, i=0;
Random rand =new Random();
Scanner scan=new Scanner (System.in );
int sayi = rand.nextInt(100);
boolean oyunDurumu =false;
int []tahminler=new int [5];


System.out.println("tahmin oyununa ho�geldiniz");
System.out.println("0-99 aras�nda bir say� tutunuz");


while (hak>0) {
	System.out.println("Tahmininiz: ");
	tahmin =scan.nextInt();
	tahminler[i++]=tahmin;
	
	if ((tahmin <0) || (tahmin >99)){
		System.out.println("L�tfen 0-99 aras�nda bir say� giriniz : ");
		continue;
	
	}
	if(tahmin==sayi) {
		oyunDurumu=true;
		System.out.println("tebrikler do�ru tahmin");
		System.out.println("Say�n�z: "+sayi);
		System.out.println("Kalan hak: "+hak);
		break;
		
		
	}else {
		System.out.println("Yanl�� , tekrar deneyiniz! Kalan hak: "+--hak);
	}
	
	
	}
System.out.println("TAHM�NLER�N�Z: ");
for(int value:tahminler) {
	if(value!=0)
	System.out.println(value );
}

	}

}
