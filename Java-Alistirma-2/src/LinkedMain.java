import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedMain {

	public static void main(String[] args) {
		LinkedList<String> sehirler=new LinkedList<String>();
		sehirler.add("Ankara");
		sehirler.add("Eski�ehir");
		sehirler.add("Afyon");
		
		sehirleri_turla(sehirler);
				

	}
	public static void islemleri_bastir() {
		System.out.println("0-i�lemleri g�r�nt�le");
		System.out.println("1-bir sonraki �ehre git");
		System.out.println("2-bir �nceki �ehre git");
		System.out.println("3-uygulamadan ��k...");
	}
	public static  void sehirleri_turla(LinkedList<String>sehirler) {
		ListIterator<String> iterator= sehirler.listIterator();
		
		int islem;
	
		islemleri_bastir();
		Scanner scanner =  new Scanner(System.in);
		if(!iterator.hasNext()) {
			System.out.println("herhangi bir �ehir bulunmmuyor...");
		}
		boolean cikis=false;
		boolean ileri=true;
		
		while(!cikis) {
		System.out.println("bir i�lem se�iniz: ");
		islem = scanner.nextInt();
		switch(islem) {
		case 0 :
			islemleri_bastir();
			break;
		case 1:
			if(!ileri) {
			if(iterator.hasNext()) {
				iterator.next();
			}
			ileri=true;
			}
			if(iterator.hasNext()) {
				System.out.println("�ehre gidiyor: "+iterator.next());
			}
			else {
				System.out.println("gidilecek �ehir kalmad�.");
				ileri=true;
			}
			break;
		case 2 :
			if(ileri) {
				if(iterator.hasPrevious()) {
					iterator.previous();
				}
				ileri=false;
				}
			if(iterator.hasPrevious()) {
				System.out.println("�ehre gidiyor: "+iterator.previous());
			}
			else {
				System.out.println("�ehir turu ba�lad�...");
			}
			
			break;
		case 3: 
			cikis=true;
			System.out.println("uygulamadan ��k�l�yor...");
			break;
		}
		}
		
	}

}
