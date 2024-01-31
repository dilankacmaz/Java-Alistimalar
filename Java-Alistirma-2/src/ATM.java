import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {
		Login login= new Login();
		Scanner input = new Scanner (System.in);
		System.out.println("bankamaýza hoþgeldiniz...");
		System.out.println("****************************");
		System.out.println("kulannýcý giriþi: ");
		System.out.println("****************************");
		int giris_hakki=3;
		while(true) {
			if(login.login(hesap)) {
				System.out.println("giriþ baþarýlý..");
				break;
			}
			else {
				System.out.println("giriþ baþarýsýz...");
				giris_hakki -= 1;
				System.out.println("kalan giriþ hakký:"+ giris_hakki);
				
			}
			if(giris_hakki==0) {
				System.out.println("giriþ hakkýnýz bitti...");
				return ;
			}
		}
		System.out.println("****************************");
		String islemler = "1. bakiye Görüntüle\n"
				           + "2. para yatýrma\n"
				           + "3. para çekme\n"
				           + "çýkýþ için q'ya basýn ";
		System.out.println(islemler);
		System.out.println("****************************");
		
		while(true) {
			System.out.println("iþlem seçiniz: ");
			String islem = input.nextLine();
			if(islem.equals("q")) {
				break;
			}
			else if(islem.equals("1")){
				System.out.println(hesap.getbakiye());
			}
			else if(islem.equals("2")) {
				System.out.println("yatýrmak istenilen tutar: ");
				int tutar =input.nextInt();
				input.nextLine();
				hesap.ParaYatir(tutar);
				
			}
			else if(islem.equals("3")){
				System.out.println("çekilmek istenilen tutar: ");
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
