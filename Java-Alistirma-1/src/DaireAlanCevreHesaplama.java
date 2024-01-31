import java.util.Scanner;

public class DaireAlanCevreHesaplama {

	
	public static void main(String[] args) {
Scanner input=new Scanner (System.in);
double pi = 3.14;
int r;
double alan;
double çevre;

System.out.println("Yarýçapý giriniz: ");
r= input.nextInt();

alan = pi*r*r;
System.out.println("alaný: "+alan);

çevre = 2*pi*r;
System.out.println("çevresi: "+çevre);




	}

}
