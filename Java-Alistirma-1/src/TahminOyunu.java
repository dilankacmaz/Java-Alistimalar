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


System.out.println("tahmin oyununa hoþgeldiniz");
System.out.println("0-99 arasýnda bir sayý tutunuz");


while (hak>0) {
	System.out.println("Tahmininiz: ");
	tahmin =scan.nextInt();
	tahminler[i++]=tahmin;
	
	if ((tahmin <0) || (tahmin >99)){
		System.out.println("Lütfen 0-99 arasýnda bir sayý giriniz : ");
		continue;
	
	}
	if(tahmin==sayi) {
		oyunDurumu=true;
		System.out.println("tebrikler doðru tahmin");
		System.out.println("Sayýnýz: "+sayi);
		System.out.println("Kalan hak: "+hak);
		break;
		
		
	}else {
		System.out.println("Yanlýþ , tekrar deneyiniz! Kalan hak: "+--hak);
	}
	
	
	}
System.out.println("TAHMÝNLERÝNÝZ: ");
for(int value:tahminler) {
	if(value!=0)
	System.out.println(value );
}

	}

}
