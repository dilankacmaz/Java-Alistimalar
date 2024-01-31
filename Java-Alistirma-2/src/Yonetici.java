
public class Yonetici extends Calisan{

	private int sorumlu_kisi_sayisi;
	public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
		super(ad,soyad,id);
		this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
	}
	
	public void bilgilerigoster() {
		super.bilgilerigoster();
		System.out.println("Yöneticin sorumlu olduðu kiþi sayýsý: "+sorumlu_kisi_sayisi);
		
	}
	public void zamYap(int zamMiktari) {
		System.out.println(getad()+" çalýþanlara  "+zamMiktari+" kadar zam yapýyor");
	}
}
