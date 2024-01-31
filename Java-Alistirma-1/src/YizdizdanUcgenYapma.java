import java.util.Scanner;

public class YizdizdanUcgenYapma {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Sayý giriniz: ");
		int star=input.nextInt();
		int i=1;
		while(i<=star) {
			int k=1;
			while(k<=i) {
			System.out.print("*");
			k++;
			}
			System.out.println();
			i++;
}

	}

}
