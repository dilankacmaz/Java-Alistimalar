import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {
		
    Scanner input=new Scanner(System.in);
    System.out.println("Bir sayi giriniz ");
    
int a=input.nextInt();
int s1=0;
int s2=1;
int toplam;
System.out.println( a+ " fibonacci serisi");
		for(int i=0;i<=a;i++) {
			System.out.print(s1+ " , ");
			toplam=s1+s2;
			s1=s2;
			s2=toplam;
		}

	}

}
