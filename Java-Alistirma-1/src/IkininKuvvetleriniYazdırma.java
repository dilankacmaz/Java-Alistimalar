import java.util.Scanner;

public class IkininKuvvetleriniYazdýrma {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Sayi giriniz: ");
		int sayi=input.nextInt();
		int sayac=1;
		
		while(sayac<=sayi ) {
			System.out.println(sayac);
			sayac*=2;
		}
		
		
	}

}
