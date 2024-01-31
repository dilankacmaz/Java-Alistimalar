
public class Yonetici extends Calisan{

	private int sorumlu_kisi_sayisi;
	public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
		super(ad,soyad,id);
		this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
	}
	
	public void bilgilerigoster() {
		super.bilgilerigoster();
		System.out.println("Y�neticin sorumlu oldu�u ki�i say�s�: "+sorumlu_kisi_sayisi);
		
	}
	public void zamYap(int zamMiktari) {
		System.out.println(getad()+" �al��anlara  "+zamMiktari+" kadar zam yap�yor");
	}
}
