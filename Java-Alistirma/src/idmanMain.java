import java.util.Scanner;

public class idmanMain {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
        
		System.out.println("hoþgeldiniz..");
		String idmanlar = "geçerli hareketler\n"
				+"burpee\n"
				+"pushup\n"
				+"situp\n"
				+"squat\n";
		System.out.println(idmanlar);
		System.out.println("idman oluþturun: ");
		System.out.println(" burpee sayýsý : ");
		int burpee = input.nextInt();
		System.out.println(" pushup sayýsý : ");
		int pushup = input.nextInt();
		System.out.println(" situp sayýsý : ");
		int situp = input.nextInt();
		System.out.println(" squat sayýsý : ");
		int squat = input.nextInt();
		
		
		idman idmann= new idman(burpee, pushup,situp,squat);
		System.out.println("idman baþlýyor...");
		while(idmann.idmanBittiMi() == false) {
			System.out.println("hareket türü : ");
			String tur = input.nextLine();
			System.out.println("bu hareketten kaç tane yapacaksýnýz? ");
			int sayi = input.nextInt();
			input.nextLine();
			idmann.hareketYap(tur, sayi);
		}
	}

}
