import java.util.Scanner;

public class UcakBiletHesaplama {
// km birim fiyatý =0.10
	//12 yaþýndan küçükleree %50 indirim
	//12 ve 24 yaþ arasýndaysa %10 indirim
	//65 yaþýndan büyükse %30 indirim
	// gidiþ dönüþ alýrsa %20 indirim
	//uçak bileti hesaplayan pprogram
	
	public static void main(String[] args) {

		Scanner input=new Scanner (System.in );
		System.out.println("Yolu giriniz: ");
		int yol=input.nextInt();
		System.out.println(" Yasýnýzý giriniz: ");
		int yas=input.nextInt();
		System.out.println("hangi tip seçiyorsunuz 1-tek yön, 2-gidiþ dönüþ");
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
