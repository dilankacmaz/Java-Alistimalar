
public class PolindromeHesaplama {

	public static void main(String[] args) {
		System.out.println(isPolindrome(121));

	}
	static boolean isPolindrome(int input) {
		int temp,tersSayi=0 , kalan;
		temp =input;
		 
		while (temp!=0) {
			kalan= temp%10;
			tersSayi= tersSayi *10+kalan;
			temp=temp/10;
			
		}
		if(input==tersSayi)
			return true;
		else 
		return false;
		
		
	}
	

}
