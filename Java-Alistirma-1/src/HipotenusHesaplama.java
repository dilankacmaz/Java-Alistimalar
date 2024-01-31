import java.util.Scanner;

public class HipotenusHesaplama {

	public static void main(String[] args) {
 Scanner input=new Scanner (System.in);
 int kenaruzunlugu1,kenaruzunlugu2;
 System.out.println("Kenar uzunluðunu giriniz: ");
 kenaruzunlugu1= input.nextInt();
 System.out.println("Kenar uzunluðunu giriniz: ");
 kenaruzunlugu2= input.nextInt();
 int hipotenus;
 hipotenus= (int) Math.sqrt(kenaruzunlugu2*kenaruzunlugu2 + kenaruzunlugu1*kenaruzunlugu1);
 System.out.println(hipotenus);

 
	}

}
