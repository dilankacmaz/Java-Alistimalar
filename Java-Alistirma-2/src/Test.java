import java.util.Scanner;

public class Test {
private static Sarkicilar sarkicilar = new Sarkicilar();
private static Scanner scanner= new Scanner (System.in);
public static void islemleri_bastir() {
	System.out.println("\t 0-i�lemleri g�r�nt�le");
	System.out.println("\t 1-�ark�c�lar� g�r�nt�le");
	System.out.println("\t 2-�ark�c�lar� ekle");
	System.out.println("\t 3-�ark�c� g�ncelle");
	System.out.println("\t 4-�ark�c� sil");
	System.out.println("\t 5-�ark�c� ara");
	System.out.println("\t 6-uygulamadan ��k");
}
public static void goruntule() {
	sarkicilar.sarkicilari_bastir();
}
public static void sarkici_ekle() {
	System.out.println("eklemek istedi�iniz �ark�c� : ");
	String isim=scanner.nextLine();
	sarkicilar.sarkici_ekle(isim);
	
}
public static void sarkici_guncelle() {
	System.out.println("g�ncellemek istedi�iniz �ark�c�: 123");
	int pozisyon = scanner.nextInt();
	scanner.nextLine();
	String yeni_isim=scanner.nextLine();
	sarkicilar.sarkici_g�ncelle(yeni_isim, pozisyon-1);
	
}
public static void sil() {
	System.out.println("silmek istedi�iniz pozisyon");
	int pozisyon=scanner.nextInt();
	sarkicilar.sarkici_sil(pozisyon-1);
}
public static void ara() {
	System.out.println("aramak istedi�inz �ark�c�");
	String isim=scanner .nextLine();
	sarkicilar.sarkici_ara(isim);
}
	public static void main(String[] args) {
	
System.out.println("\t �ark�c� uygulamas�na ho�geldin...");
islemleri_bastir();

boolean cikis=false;
int islem;
while(!cikis) {
	System.out.println("bir i�lem se�iniz: ");
	islem=scanner.nextInt();
	scanner.nextLine();
	switch(islem) {
	case 0:
		islemleri_bastir();
		break;
	case 1: 
		goruntule();
		break;
	case 2: 
		sarkici_ekle();
		break;
	case 3:
		sarkici_guncelle();
		break;
	case 4:
		sil();
		break;
	case 5: 
		ara();
		break;
	case 6:
		cikis=true;
		System.out.println("uygulamadan ��k�l�yor...");
		break;
		
	
	}
	
}
	}

}
