
public class Kare extends Sekil{
private int kenar;
	
	public Kare(String isim,int kenar) {
		super(isim);
		this.kenar = kenar;
	}
	
	
	public void alanHesapla() {
		System.out.println(getisim()+ (kenar*kenar));
	}
}
