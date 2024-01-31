import java.util.Scanner;

public class TekSayýlarýToplama {
//negatif bir deðere girilene kadar kullanýcýdan giriþleri kabul eder ve girilen deðerllerden tek sayýlarý toplayan program
	
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


