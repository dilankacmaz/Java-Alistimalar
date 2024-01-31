import java.util.Scanner;

public class Vec {

	private String isim;
	private int i;
	private int j;
	private int k;
	
	public Vec(String isim ) {
		this.isim = isim;
		Scanner scanner = new Scanner (System.in);
		System.out.println(isim +"vektörün i j ve k deðerlerini giriniz: ");
		System.out.println("i: ");
		this.i = scanner.nextInt();
		System.out.println("j: ");
		this.j = scanner.nextInt();
		System.out.println("k: ");
		this.k = scanner.nextInt();
		scanner.nextLine();
		
	}
	
	public void setisim(String isim) {
		this.isim = isim;
		
	}
	public String getisim() {
		return isim;
	}
	
	public void seti(int i) {
		this.i = i;
		

	}
	public int geti() {
		return i;
	}
	public void setj(int j) {
		this.j = j;
		
	}
	public int getj() {
		return j;
	}
	public void setk(int k) {
		this.k = k;
		
	}
	public int getk() {
		return k;
	}
	
}
