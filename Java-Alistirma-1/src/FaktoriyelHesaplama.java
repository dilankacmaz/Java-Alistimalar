import java.util.Scanner;

public class FaktoriyelHesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
				System.out.println("Sayi giriniz: ");
		int sayi=input.nextInt();
		int fakt�riyel=1;
		while(sayi>0) {
			
			fakt�riyel*=sayi;
			sayi--;
			
		}
		System.out.println(fakt�riyel);

		

	}

}
