import java.util.Scanner;

public class MainCalisanYazilimciYonetici {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("hoþgeldiniz...");
		String islemler = "iþlemler\n"
				        + "1. Yazýlýmcý iþlemleri\n"
				        + "2. Yönetici iþlemleri\n"
				        + "Çýkýþ için q'ya basýn";
		System.out.println("**************************************");
		System.out.println(islemler);
		System.out.println("**************************************");
        while(true) {
        	System.out.println("iþlemi seçiniz: ");
        	String islem = input.nextLine();
        	
        	if(islem.equals("q")) {
        		System.out.println("programdan çýkýlýyor ");
        		break;
        	}
        	else if(islem.equals("1")) {
        		
        		Yazilimci yazilimci = new Yazilimci("Dilan","Kaçmaz",6372,"java");
        		String yazilimci_islem = "1. Format at\n"
        				                + "2. Bilgileri göster\n"
        				                +"Çýkýþ için q'ya basýn";
        		
        		System.out.println(yazilimci_islem);
        		while(true) {
        			System.out.println("iþmel seçinz: ");
        			String y_islem = input.nextLine();
        			
        			if(y_islem.equals("q")) {
                		System.out.println("programdan çýkýlýyor ");
                		break;
                	}
        			else if(y_islem.equals("1")) {
        				System.out.println("iþletim sistemi ");
        				String isletim_sistemi=input.nextLine();
        				yazilimci.formatAt(isletim_sistemi);
        			}
        			else if(y_islem.equals("2")) {
        				
        				yazilimci.bilgilerigoster();
        			}
        			else {
        				System.out.println("geçersiz");
        			}
        		}
        	}
            else if(islem.equals("2")) {
                 Yonetici yonetici = new Yonetici("Rumeysa","Kaçmaz",123,23);
                 String yonetici_islem = "1.zam yap\n"
			                           + "2. Bilgileri göster\n"
			                           +"Çýkýþ için q'ya basýn";
                 System.out.println(yonetici_islem);
                 
                 while(true) {
                	 System.out.println("iþlem seçiiz");
                	 String y_islem= input.nextLine();
                	 if(y_islem.equals("q")) {
                 		System.out.println("programdan çýkýlýyor ");
                 		break;
                 	}
         			else if(y_islem.equals("1")) {
         				System.out.println("zam miktarý ");
         			     int zamMiktari=input.nextInt();
         			     input.nextLine();
         				yonetici.zamYap(zamMiktari);
         			}
         			else if(y_islem.equals("2")) {
         				
         				yonetici.bilgilerigoster();
         			}
         			else {
         				System.out.println("geçersiz");
         			}
                	 
                 }
        	}
            else {
            	System.out.println("geçersiz iþlem.");
            }
        }
	}

}




















