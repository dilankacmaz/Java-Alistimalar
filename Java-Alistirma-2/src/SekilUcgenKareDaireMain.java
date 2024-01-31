import java.util.Scanner;

public class SekilUcgenKareDaireMain {

	public static void main(String[] args) {
      Scanner scanner= new Scanner (System.in);
      String islemler = "iþlemler...\n"
    		           +"1. Kare Alan Hesapla\n"
    		           +"2. Üçgen Hesapla\n"
    		           +"3. Daire Hesapla\n"
    		           +"q Uygulamadan çýkýþ yapýlýyor...";
      
      
      while(true){
    	  System.out.println(islemler);
    	  System.out.println("Hangi þeklin alanýný hesaplamak isitiyorsunuz?");
    	  String sekil_turu = scanner.nextLine();
    	  Sekil sekil = null;
   
    	  if(sekil_turu.equals("q")) {
    		  System.out.println("programdan çýkýlýyor...");
    		  break;
    	  }
    	  else if(sekil_turu.equals("1")) {
    		  System.out.println("karenin kenar uzunluðu: ");
    		  int kenar =scanner.nextInt();
    		  scanner.nextLine();
    		  sekil=new Kare("Kare1: ",kenar);
    		  sekil.alanHesapla();
      }
    	  else if(sekil_turu.equals("2")) {
    		  System.out.println("kenar 1: ");
    		  int kenar1 = scanner.nextInt();
    		  System.out.println("kenar 2: ");
    		  int kenar2 = scanner.nextInt();
    		  System.out.println("kenar 3: ");
    		  int kenar3 = scanner.nextInt();
    		  scanner.nextLine();
    		  sekil = new Ucgen("Ucgen 1",kenar1,kenar2,kenar3);
    		  sekil.alanHesapla();
    	  }
    	  else if(sekil_turu.equals("3")) {
    		  System.out.println("dairenin yarýçapý : ");
    		  int yaricap =scanner.nextInt();
    		  scanner.nextLine();
    		  sekil = new Daire("Daire 1",yaricap);
    		  sekil.alanHesapla();
    	  }
    	  else {
    		  System.out.println("geçersiz iþlem...");
    	  }
    	  		      
	}

}
}
