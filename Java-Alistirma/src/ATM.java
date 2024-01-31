import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {
		Login login= new Login();
		Scanner input = new Scanner (System.in);
		System.out.println("bankama�za ho�geldiniz...");
		System.out.println("****************************");
		System.out.println("kulann�c� giri�i: ");
		System.out.println("****************************");
		int giris_hakki=3;
		while(true) {
			if(login.login(hesap)) {
				System.out.println("giri� ba�ar�l�..");
				break;
			}
			else {
				System.out.println("giri� ba�ar�s�z...");
				giris_hakki -= 1;
				System.out.println("kalan giri� hakk�:"+ giris_hakki);
				
			}
			if(giris_hakki==0) {
				System.out.println("giri� hakk�n�z bitti...");
				return ;
			}
		}
		System.out.println("****************************");
		String islemler = "1. bakiye G�r�nt�le\n"
				           + "2. para yat�rma\n"
				           + "3. para �ekme\n"
				           + "��k�� i�in q'ya bas�n ";
		System.out.println(islemler);
		System.out.println("****************************");
		
		while(true) {
			System.out.println("i�lem se�iniz: ");
			String islem = input.nextLine();
			if(islem.equals("q")) {
				break;
			}
			else if(islem.equals("1")){
				System.out.println(hesap.getbakiye());
			}
			else if(islem.equals("2")) {
				System.out.println("yat�rmak istenilen tutar: ");
				int tutar =input.nextInt();
				input.nextLine();
				hesap.ParaYatir(tutar);
				
			}
			else if(islem.equals("3")){
				System.out.println("�ekilmek istenilen tutar: ");
				int tutar =input.nextInt();
				input.nextLine();
				hesap.ParaCekme(tutar);
			}
			else {
				System.out.println("gecersiz..");
			}
					
		}
				             
		}

}
