import java.util.Scanner;

public class VecProblemMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("matematik ve vizik problemlerine hoþgeldiniz...");
       String islemler= " iþlemler...\n"
       		+ "1.daire alaný hesaplama\n"
       		+ "2. üçgen çevresi hesaplama\n"
       		+ "3. 2 vektörün iç çarpýmýný hesaplama\n"
       		+ "çýkýþ için q ya basýnýz...";
       	while(true) {
       		System.out.println(islemler);
       System.out.println("iþlem seçiniz: ");
       String islem = scanner.nextLine();
       if(islem.equals("q")) {
    	   System.out.println("progrramdan çýkýlýyor ");
    	   break;
       }
       else if(islem.equals("1")) {
    	   System.out.println("yarýçap : ");
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
    	   Vec vec1 =  new Vec("vektör1");
    	   Vec vec2 = new Vec("vektör2");
    	   Problem.Fizik.icCarpim(vec1, vec2);
    	   
       }
       else {
    	   System.out.println("geçersiz iþlem...");
       }
       	}
       	}

}
