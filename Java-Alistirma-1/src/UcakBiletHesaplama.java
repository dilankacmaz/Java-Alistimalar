import java.util.Scanner;

public class UcakBiletHesaplama {
// km birim fiyat� =0.10
	//12 ya��ndan k���kleree %50 indirim
	//12 ve 24 ya� aras�ndaysa %10 indirim
	//65 ya��ndan b�y�kse %30 indirim
	// gidi� d�n�� al�rsa %20 indirim
	//u�ak bileti hesaplayan pprogram
	
	public static void main(String[] args) {

		Scanner input=new Scanner (System.in );
		System.out.println("Yolu giriniz: ");
		int yol=input.nextInt();
		System.out.println(" Yas�n�z� giriniz: ");
		int yas=input.nextInt();
		System.out.println("hangi tip se�iyorsunuz 1-tek y�n, 2-gidi� d�n��");
		int tip=input.nextInt();
		double tl = yol*0.10;
		if(yas<12) {
			tl= tl- (tl*0.5);
			
			if(tip==2) {
				tl=tl-(tl*0.2);
				System.out.println(tl);
			}
			else {
				System.out.println(tl);
			}
			
		}
		else if(yas>=12 && yas<24) {
			tl=tl-(tl*0.1);
			
			if(tip==2) {
				tl=tl-(tl*0.2);
				System.out.println(tl);
			}
			else {
				System.out.println(tl);
			}
		}
		else if(yas>65) {
			tl=tl-(tl*0.3);
			
			if(tip==2) {
				tl=tl-(tl*0.2);
				System.out.println(tl);
			}
			else {
				System.out.println(tl);
			}
			
		}
		else {
			System.out.println(tl);
			if(tip==2) {
				tl=tl-(tl*0.2);
				System.out.println(tl);
			}
			else {
				System.out.println(tl);
			}
		}
		
		
	}

}
