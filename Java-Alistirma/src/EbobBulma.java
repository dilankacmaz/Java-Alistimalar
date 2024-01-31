import java.util.Scanner;

public class EbobBulma {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("birinci sayýyý griniz: ");
    int birinci=input.nextInt();
    System.out.println("ikinci sayýyý griniz: ");
    int ikinci=input.nextInt();
    System.out.println(Ebob(birinci,ikinci));
	}
	public static int Ebob(int a ,int b) {
		 
		int ebob=1;
		for(int i=1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0) {
				ebob=i;
			}
		}
		return ebob;
		}
	}


