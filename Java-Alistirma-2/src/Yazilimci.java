
public class Yazilimci extends Calisan{
	
	private String diller;
	
	public Yazilimci(String ad,String soyad, int id,String diller) {
		super(ad,soyad,id);
		this.diller =  diller;
	}
	public void formatAt(String isletim_sistemi) {
		System.out.println(getad()+" "+isletim_sistemi+"ni y�kl�yor.");
	}
	
	public void bigilerigoster() {
		super.bilgilerigoster();
		System.out.println("yaz�l�mc�n�n bildi�i diller " +
		diller);
	}
	

}
