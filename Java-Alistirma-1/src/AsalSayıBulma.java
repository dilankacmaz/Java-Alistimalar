import java.util.Scanner;

public class AsalSay�Bulma {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int sayi;
boolean asal=true;
 do{
	 System.out.println("pozitif sayi  giriniz : ");
	 sayi=input.nextInt();
	 
 }while(sayi<2);
 for (int i=2;i<sayi; i++) {
	 if(sayi%i==0) {
		 asal=false;
		 break;
	 }
 }
 if(asal) {
	 System.out.println("say� asald�r->"+sayi);
 }
 else {
	 System.out.println("asal de�ildir->"+sayi);
 }
	 
 
	}

}
