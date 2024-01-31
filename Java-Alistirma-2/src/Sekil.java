
public abstract class Sekil {

	private String isim;
	public Sekil(String isim) {
		this.isim = isim;
		
	}
	public void   Setisim(String isim) {
		this.isim = isim;
		
	}
	public String getisim() {
		return isim;
	}
    abstract void alanHesapla();
    
}




