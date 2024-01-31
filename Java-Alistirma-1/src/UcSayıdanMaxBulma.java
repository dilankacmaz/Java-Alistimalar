import java.util.Scanner;

public class UcSayýdanMaxBulma {

	public static void main(String[] args) {		
		Scanner input =new Scanner(System.in);
		
		System.out.println("birinci sayý: ");
		int sayi1=input.nextInt();
		System.out.println("ikinci  sayý: ");
		int sayi2=input.nextInt();
		System.out.println("üçüncü sayý: ");
		int sayi3=input.nextInt();
		
		int max=0;
		if( sayi1>sayi2 && sayi1>sayi3) {
			max=sayi1;
			
		}
		else if(sayi2>sayi1 && sayi2>sayi3) {
			max=sayi2;
			
		}
		else {
			max=sayi3;
		}
System.out.println(max);
	}

}
