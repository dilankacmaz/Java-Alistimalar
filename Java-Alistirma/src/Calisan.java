
public class Calisan {

	private String ad;
	private String soyad;
	private int id;
	
	public Calisan(String ad, String soyad, int id){
		this.ad = ad;
		this.soyad = soyad;
		this.id = id;
	}
	
	
	public void bilgilerigoster() {
		System.out.println("calýsþan bilgileri: ");
		System.out.println(ad);
		System.out.println(soyad);
		System.out.println(id);
	}
	
	
	public void setad(String ad ) {
		this.ad = ad ;
	}
	public String getad() {
		return ad;
	}
	
	public void setsoyad(String soyad) {
		this.soyad =  soyad;
	}
	public String getsoyad() {
		return soyad;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	public int getid(){
		return id;
	}

}
