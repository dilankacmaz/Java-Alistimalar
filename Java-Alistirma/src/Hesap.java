
public class Hesap {

	
	private String kullanici_adi;
	private String parola;
	private double bakiye;
	
	
	public Hesap(String kullanici_adi, String parola, double bakiye) {
		this.kullanici_adi = kullanici_adi;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	
	public void setkullanici(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}
	public String getkullanici() {
		return kullanici_adi;
	}
	
	
	public void setparola(String parola) {
		this.parola = parola;
	}
	public String getparola() {
		return parola;
	}
	
	
	
	public void setbakiye(double bakiye) {
		this.bakiye =  bakiye;
	}
	public double getbakiye() {
		return bakiye;
	}
	
	public void ParaYatir(double tutar) {
		bakiye = bakiye + tutar;
		System.out.println("yeni bakiyeniz: "+ bakiye);
	}
	public void ParaCekme(double tutar) {
		if((bakiye - tutar)< 0) {
			System.out.println("yeterli bakiye yok...");
		}
		else {
			bakiye = bakiye - tutar;
			System.out.println("yeni bakiyeniz: "+ bakiye);
		}
		
	}
}
