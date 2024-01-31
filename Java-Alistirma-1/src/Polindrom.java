import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String  tmp="";
		System.out.println("bir kelime giriniz");
		String kelime=scan.nextLine();
		
		for(int i=kelime.length()-1; i>=0;i--) {
			tmp+= kelime.charAt(i);
			
		}
		if(tmp.equals(kelime)) {
			System.out.println("polindromik");
		}
		else {
			System.out.println("polindromik deðil");
		}
	}

}
