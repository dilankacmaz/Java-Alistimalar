import java.util.Scanner;

public class FaktoriyelHesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
				System.out.println("Sayi giriniz: ");
		int sayi=input.nextInt();
		int faktöriyel=1;
		while(sayi>0) {
			
			faktöriyel*=sayi;
			sayi--;
			
		}
		System.out.println(faktöriyel);

		

	}

}
