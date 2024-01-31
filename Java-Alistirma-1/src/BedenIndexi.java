import java.util.Scanner;

public class BedenIndexi {

	
	public static void main(String[] args) {
    Scanner input =new Scanner (System.in);
    int kilo ;
    double boy  , index;
    System.out.println("boyunuzu giriniz: ");
     boy=input.nextDouble();
     System.out.println("Kilonuzu giriniz: ");
     kilo= input.nextInt();
      index= kilo/(boy*boy);
      System.out.println(index);
	}

}
