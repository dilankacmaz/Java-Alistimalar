import java.util.Scanner;

public class OrtalamaHesaplama {

	public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    
    int quiz , vize , finall;
    double ortalama;
    
    System.out.println("Quiz notunuzu giriniz : ");
    quiz =input.nextInt();
    
    System.out.println("Vize notunuzu giriniz : ");
    vize =input.nextInt();
    
    System.out.println("Final notunuzu  giriniz: ");
    finall= input.nextInt();
    
    ortalama= (quiz*0.2)+(vize*0.35)+(finall*0.45);
    System.out.println(ortalama);
    
    String sonuc = (ortalama>= 50)? "Geçtiniz" : "Kaldýnýz" ;
    System.out.println(sonuc);
    
	}

}
