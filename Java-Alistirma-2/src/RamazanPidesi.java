import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RamazanPidesi {

	public static void main(String[] args) {
		System.out.println("ramazan pidesi uygulamasý");
		Random random = new Random();
    Queue<String> pide_kuyrugu = new LinkedList<String>();
    pide_kuyrugu.offer("Dilan");
    pide_kuyrugu.offer("Ayþe");
    pide_kuyrugu.offer("Faruk");
    pide_kuyrugu.offer("Mustafa");
    pide_kuyrugu.offer("Doðukan");
    pide_kuyrugu.offer("Þüheda");
    pide_kuyrugu.offer("Elif");
    pide_kuyrugu.offer("Dilara");
    pide_kuyrugu.offer("Enes");
    pide_kuyrugu.offer("Onur");
    
    int pide_sayisi = 1+ random.nextInt(10);
    System.out.println("pideler çýkýyor..");
    System.out.println("çýkan pide sayýsý: "+pide_sayisi);
    
    while(pide_sayisi!=0) {
    	System.out.println(pide_kuyrugu.poll()+" pideyi aldý...");
    	pide_sayisi--;
    	
    }
    System.out.println("pide kalmadý");
	}

}
