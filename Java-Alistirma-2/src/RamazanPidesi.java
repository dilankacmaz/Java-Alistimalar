import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RamazanPidesi {

	public static void main(String[] args) {
		System.out.println("ramazan pidesi uygulamas�");
		Random random = new Random();
    Queue<String> pide_kuyrugu = new LinkedList<String>();
    pide_kuyrugu.offer("Dilan");
    pide_kuyrugu.offer("Ay�e");
    pide_kuyrugu.offer("Faruk");
    pide_kuyrugu.offer("Mustafa");
    pide_kuyrugu.offer("Do�ukan");
    pide_kuyrugu.offer("��heda");
    pide_kuyrugu.offer("Elif");
    pide_kuyrugu.offer("Dilara");
    pide_kuyrugu.offer("Enes");
    pide_kuyrugu.offer("Onur");
    
    int pide_sayisi = 1+ random.nextInt(10);
    System.out.println("pideler ��k�yor..");
    System.out.println("��kan pide say�s�: "+pide_sayisi);
    
    while(pide_sayisi!=0) {
    	System.out.println(pide_kuyrugu.poll()+" pideyi ald�...");
    	pide_sayisi--;
    	
    }
    System.out.println("pide kalmad�");
	}

}
