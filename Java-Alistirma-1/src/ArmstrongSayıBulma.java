import java.util.Scanner;

public class ArmstrongSay�Bulma {

	public static void main(String[] args) {
int temp, birler,onlar,y�zler,toplam;
for(int i=100;i<=999;i++) {
	temp=i;
	birler=temp % 10;
	temp/=10;
	
	onlar= temp%10;
	temp/=10;
	
	y�zler=temp%10;
	temp/=10;
	toplam=(birler*birler*birler)+(onlar*onlar*onlar)+(y�zler*y�zler*y�zler);
	
	if(toplam==i) {
		System.out.println(i+" armstrong say�d�r.");
	}
	
	
	
	
	
	
}
	
	
}
}
