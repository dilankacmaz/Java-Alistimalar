import java.util.Scanner;

public class KmBasinaParaHesaplama {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		int yol;
		double kmpara=3.10;
		double tutar;
		 System.out.println("Yol uzunluðunu giriniz: ");
		yol= input.nextInt();
		tutar= yol*kmpara;
		System.out.println(tutar + " tl ");
		
	}

}
