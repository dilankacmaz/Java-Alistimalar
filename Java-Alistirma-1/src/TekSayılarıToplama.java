import java.util.Scanner;

public class TekSay�lar�Toplama {
//negatif bir de�ere girilene kadar kullan�c�dan giri�leri kabul eder ve girilen de�erllerden tek say�lar� toplayan program
	
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
int toplam=0;
int sayi;
while(true) {
	System.out.println("sayi giriniz: ");
	sayi=input.nextInt();
	 if(sayi<0) {
		 System.out.println("program bitti ");
		 System.out.println(toplam);
		 break;
		 
	 }
	 if(sayi%2==1) {
		 toplam=toplam+sayi;
		 
	 }
}
	
}
		
	}


