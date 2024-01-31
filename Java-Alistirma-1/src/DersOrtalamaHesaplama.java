import java.util.Scanner;

public class DersOrtalamaHesaplama {

	public static void main(String[] args) {
int[] notlar = new int[7];
int toplam=0;
Scanner input=new Scanner (System.in);
System.out.println("lütfen notlarý giriniz");
System.out.println("Matematik:" );
notlar[0]=input.nextInt();
System.out.println("Türkçe: ");
notlar[1]=input.nextInt();
System.out.println("Fizik: ");
notlar[2]=input.nextInt();
System.out.println("Tarih:");
notlar[3]=input.nextInt();
System.out.println("Kimya: ");
notlar[4]=input.nextInt();
System.out.println("beden: ");
notlar[5]=input.nextInt();
System.out.println("Müzik:");
notlar[6]=input.nextInt();

for( int not: notlar ) {
	toplam+=not;
}

System.out.println("ortalamanz: "+toplam/notlar.length);;


	}

}
