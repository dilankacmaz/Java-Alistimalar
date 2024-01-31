import java.util.Scanner;

public class HarmonikSayi {

	//harmonik(n)=1+ 1/2  +1/3+  1/n
	public static void main(String[] args) {
Scanner input =new Scanner(System.in);
System.out.println("Sayi  giriniz: ");
double sayi=input .nextDouble();
double toplam=0.0;
while(sayi>0) {
	toplam+=(1/sayi);
	sayi--;
	
	
}

System.out.println(toplam);


	}

}
