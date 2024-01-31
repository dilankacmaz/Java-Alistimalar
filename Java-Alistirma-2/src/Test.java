import java.util.Scanner;

public class Test {
private static Sarkicilar sarkicilar = new Sarkicilar();
private static Scanner scanner= new Scanner (System.in);
public static void islemleri_bastir() {
	System.out.println("\t 0-iþlemleri görüntüle");
	System.out.println("\t 1-þarkýcýlarý görüntüle");
	System.out.println("\t 2-þarkýcýlarý ekle");
	System.out.println("\t 3-þarkýcý güncelle");
	System.out.println("\t 4-þarkýcý sil");
	System.out.println("\t 5-þarkýcý ara");
	System.out.println("\t 6-uygulamadan çýk");
}
public static void goruntule() {
	sarkicilar.sarkicilari_bastir();
}
public static void sarkici_ekle() {
	System.out.println("eklemek istediðiniz þarkýcý : ");
	String isim=scanner.nextLine();
	sarkicilar.sarkici_ekle(isim);
	
}
public static void sarkici_guncelle() {
	System.out.println("güncellemek istediðiniz þarkýcý: 123");
	int pozisyon = scanner.nextInt();
	scanner.nextLine();
	String yeni_isim=scanner.nextLine();
	sarkicilar.sarkici_güncelle(yeni_isim, pozisyon-1);
	
}
public static void sil() {
	System.out.println("silmek istediðiniz pozisyon");
	int pozisyon=scanner.nextInt();
	sarkicilar.sarkici_sil(pozisyon-1);
}
public static void ara() {
	System.out.println("aramak istediðinz þarkýcý");
	String isim=scanner .nextLine();
	sarkicilar.sarkici_ara(isim);
}
	public static void main(String[] args) {
	
System.out.println("\t þarkýcý uygulamasýna hoþgeldin...");
islemleri_bastir();

boolean cikis=false;
int islem;
while(!cikis) {
	System.out.println("bir iþlem seçiniz: ");
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
		System.out.println("uygulamadan çýkýlýyor...");
		break;
		
	
	}
	
}
	}

}
