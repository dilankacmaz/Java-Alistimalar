
public class Daire extends Sekil{

	private int yaricap ;
	
	public Daire(String isim,int yaricap) {
		super(isim);
		this.yaricap = yaricap;
		
	}
	
	public void alanHesapla() {
		System.out.println(getisim()+"in alan� "+(Math.PI*yaricap*yaricap));
		
	}
}
