import java.util.Scanner;

public class Login {

	public  boolean login(Hesap hesap) {
		Scanner input=new Scanner(System.in);
		String kullanici_adi;
		String parola;
		
		System.out.println("kullanýcý adý: ");
		kullanici_adi = input.nextLine();
		System.out.println("parola: ");
		parola = input.nextLine();
		
		if(hesap.getkullanici().equals(kullanici_adi) && hesap.getparola().equals(parola) ) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
