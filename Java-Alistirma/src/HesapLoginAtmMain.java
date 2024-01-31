
public class HesapLoginAtmMain {

	public static void main(String[] args) {
		ATM atm =  new ATM();
		
		
		Hesap hesap= new Hesap("dilan","6372",3000);
         atm.calis(hesap);
         System.out.println("programdan çýkýlýyor ");
	}

}
