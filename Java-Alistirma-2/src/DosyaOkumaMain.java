import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DosyaOkumaMain {

	public static void main(String[] args) {
		
		try(Scanner scanner=new Scanner(new FileReader("dosya.txt"));
				FileWriter writer  = new FileWriter("harfnotlarý.txt")){
			
			while(scanner.hasNextLine()) {
				String ogrencibilgileri = scanner.nextLine();
				String []ogrenciarray = ogrencibilgileri.split(",");
				int vize1 =Integer.valueOf(ogrenciarray[1]);
				int vize2 =Integer.valueOf(ogrenciarray[2]);
				int finall =Integer.valueOf(ogrenciarray[3]);
				String cikti =harfnotuHesaplama(ogrenciarray[0],vize1,vize2,finall);
				writer.write(cikti +"\n");
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String harfnotuHesaplama(String isim, int vize1,int vize2,int finall) {
		String cikti ="";
		double toplamnot=((vize1*3/10.0)+(vize2*2/10.0)+(finall*4/10.0));
	    if(toplamnot >= 90) {
	    	cikti= isim +"bu dersi AA aldý...";
	    }
	    else if(toplamnot >=85) {
	    	cikti= isim + " bu  ders BA aldý";
	    }
	    else if(toplamnot >=80) {
	    	cikti= isim + " bu  ders BB aldý";
	    }
	    else if(toplamnot >=75) {
	    	cikti= isim + " bu  ders CB aldý";
	    }
	    else if(toplamnot >=70) {
	    	cikti= isim + " bu  ders CC aldý";
	    }
	    else if(toplamnot >=65) {
	    	cikti= isim + " bu  ders DC aldý";
	    }
	    else if(toplamnot >=60) {
	    	cikti= isim + " bu  ders DD aldý";
	    }
	    else if(toplamnot >=55) {
	    	cikti= isim + " bu  ders FD aldý";
	    }
	    else {
	    	cikti= isim + " bu  ders FF aldý";
	    }
		return cikti;
	}

}
