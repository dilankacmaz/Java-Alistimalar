import java.util.Scanner;

public class MainCalisanYazilimciYonetici {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ho�geldiniz...");
		String islemler = "i�lemler\n"
				        + "1. Yaz�l�mc� i�lemleri\n"
				        + "2. Y�netici i�lemleri\n"
				        + "��k�� i�in q'ya bas�n";
		System.out.println("**************************************");
		System.out.println(islemler);
		System.out.println("**************************************");
        while(true) {
        	System.out.println("i�lemi se�iniz: ");
        	String islem = input.nextLine();
        	
        	if(islem.equals("q")) {
        		System.out.println("programdan ��k�l�yor ");
        		break;
        	}
        	else if(islem.equals("1")) {
        		
        		Yazilimci yazilimci = new Yazilimci("Dilan","Ka�maz",6372,"java");
        		String yazilimci_islem = "1. Format at\n"
        				                + "2. Bilgileri g�ster\n"
        				                +"��k�� i�in q'ya bas�n";
        		
        		System.out.println(yazilimci_islem);
        		while(true) {
        			System.out.println("i�mel se�inz: ");
        			String y_islem = input.nextLine();
        			
        			if(y_islem.equals("q")) {
                		System.out.println("programdan ��k�l�yor ");
                		break;
                	}
        			else if(y_islem.equals("1")) {
        				System.out.println("i�letim sistemi ");
        				String isletim_sistemi=input.nextLine();
        				yazilimci.formatAt(isletim_sistemi);
        			}
        			else if(y_islem.equals("2")) {
        				
        				yazilimci.bilgilerigoster();
        			}
        			else {
        				System.out.println("ge�ersiz");
        			}
        		}
        	}
            else if(islem.equals("2")) {
                 Yonetici yonetici = new Yonetici("Rumeysa","Ka�maz",123,23);
                 String yonetici_islem = "1.zam yap\n"
			                           + "2. Bilgileri g�ster\n"
			                           +"��k�� i�in q'ya bas�n";
                 System.out.println(yonetici_islem);
                 
                 while(true) {
                	 System.out.println("i�lem se�iiz");
                	 String y_islem= input.nextLine();
                	 if(y_islem.equals("q")) {
                 		System.out.println("programdan ��k�l�yor ");
                 		break;
                 	}
         			else if(y_islem.equals("1")) {
         				System.out.println("zam miktar� ");
         			     int zamMiktari=input.nextInt();
         			     input.nextLine();
         				yonetici.zamYap(zamMiktari);
         			}
         			else if(y_islem.equals("2")) {
         				
         				yonetici.bilgilerigoster();
         			}
         			else {
         				System.out.println("ge�ersiz");
         			}
                	 
                 }
        	}
            else {
            	System.out.println("ge�ersiz i�lem.");
            }
        }
	}

}




















