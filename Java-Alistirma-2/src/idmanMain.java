import java.util.Scanner;

public class idmanMain {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
        
		System.out.println("ho�geldiniz..");
		String idmanlar = "ge�erli hareketler\n"
				+"burpee\n"
				+"pushup\n"
				+"situp\n"
				+"squat\n";
		System.out.println(idmanlar);
		System.out.println("idman olu�turun: ");
		System.out.println(" burpee say�s� : ");
		int burpee = input.nextInt();
		System.out.println(" pushup say�s� : ");
		int pushup = input.nextInt();
		System.out.println(" situp say�s� : ");
		int situp = input.nextInt();
		System.out.println(" squat say�s� : ");
		int squat = input.nextInt();
		
		
		idman idmann= new idman(burpee, pushup,situp,squat);
		System.out.println("idman ba�l�yor...");
		while(idmann.idmanBittiMi() == false) {
			System.out.println("hareket t�r� : ");
			String tur = input.nextLine();
			System.out.println("bu hareketten ka� tane yapacaks�n�z? ");
			int sayi = input.nextInt();
			input.nextLine();
			idmann.hareketYap(tur, sayi);
		}
	}

}
