import java.util.Scanner;

public class VecProblemMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("matematik ve vizik problemlerine ho�geldiniz...");
       String islemler= " i�lemler...\n"
       		+ "1.daire alan� hesaplama\n"
       		+ "2. ��gen �evresi hesaplama\n"
       		+ "3. 2 vekt�r�n i� �arp�m�n� hesaplama\n"
       		+ "��k�� i�in q ya bas�n�z...";
       	while(true) {
       		System.out.println(islemler);
       System.out.println("i�lem se�iniz: ");
       String islem = scanner.nextLine();
       if(islem.equals("q")) {
    	   System.out.println("progrramdan ��k�l�yor ");
    	   break;
       }
       else if(islem.equals("1")) {
    	   System.out.println("yar��ap : ");
    	   int yaricap = scanner.nextInt();
    	   scanner.nextLine();
    	   
    	   Problem.Matematik.daireAlan(yaricap);
    	   
       }
       else if(islem.equals("2")) {
    	   System.out.println("kenar 1: ");
    	   int kenar1 = scanner.nextInt();
    	   System.out.println("kenar 2: ");
    	   int kenar2 = scanner.nextInt();
    	   System.out.println("kenar 3: ");
    	   int kenar3 = scanner.nextInt();
    	   
    	   scanner.nextLine();
    	   Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
    	   
    	   
       }
       else if(islem.equals("3")) {
    	   Vec vec1 =  new Vec("vekt�r1");
    	   Vec vec2 = new Vec("vekt�r2");
    	   Problem.Fizik.icCarpim(vec1, vec2);
    	   
       }
       else {
    	   System.out.println("ge�ersiz i�lem...");
       }
       	}
       	}

}
