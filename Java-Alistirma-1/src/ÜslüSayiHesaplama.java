import java.util.Scanner;

public class �sl�SayiHesaplama {

	public static void main(String[] args) {
Scanner input =new Scanner(System.in);
System.out.println("�ss� al�nacak say�: ");
int sayi1=input.nextInt();
System.out.println("�ss� giriniz: ");
int sayi2=input.nextInt();
int sonuc=1;
int sayac=1;
while(sayac<=sayi2) { 
	sonuc=sonuc*sayi1;
	sayac++;
}
System.out.println(sonuc);
	}

}
