import java.util.Scanner;

public class DaireAlanCevreHesaplama {

	
	public static void main(String[] args) {
Scanner input=new Scanner (System.in);
double pi = 3.14;
int r;
double alan;
double �evre;

System.out.println("Yar��ap� giriniz: ");
r= input.nextInt();

alan = pi*r*r;
System.out.println("alan�: "+alan);

�evre = 2*pi*r;
System.out.println("�evresi: "+�evre);




	}

}
