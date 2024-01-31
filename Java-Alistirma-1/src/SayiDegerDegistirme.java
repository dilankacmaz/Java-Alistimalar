import java.util.Scanner;

public class SayiDegerDegistirme {

	public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
		  int birincisayi;
          int ikincisayi;
          System.out.println("Birinci ssayiyi giriniz: ");
          birincisayi= input.nextInt();
          System.out.println("Ýkinci sayiyi yazýnýz: ");
          ikincisayi=input.nextInt();
          
          int gecici= birincisayi;
          birincisayi=ikincisayi;
          ikincisayi=gecici;
          System.out.println(birincisayi +" - "+ ikincisayi);
		  
	}

}
