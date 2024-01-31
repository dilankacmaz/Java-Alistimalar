
public class Account {

	private String hesapno;
	private double bakiye;
	private String isim;
	private String email;
	private String telno;
	
	
	public Account() {                 
		this("bilgi yok",0.0,"bilgi yok","bilgi yok","bilgi yok");
	}
	public Account (String hesapno, double bakiye, String isim, String email, String telno) {
		this.hesapno = hesapno;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telno = telno;
	}
	
	
	
	
	
	
	
	
	public void ParaYatır(double miktar) {
		bakiye = bakiye + miktar;
		System.out.println(bakiye);
	}
	public void ParaCekme(double miktar) {
		 
		if(miktar > 1500) {
			System.out.println("bir günde bu kadar para çekiliemez");
		}
		if(bakiye - miktar < 0) {
			System.out.println("yeterli bakiye yok");
		}
		else {
			bakiye =  bakiye - miktar;
			System.out.println(bakiye);
		}
	}
	
	
	
	
	
	
	
	
	public void sethesapno(String hesapno) {
		this.hesapno = hesapno;
	}
	public String gethesapno() {
		return hesapno;
	}
	
	
	
	public void setbakiye(double bakiye) {
		this.bakiye = bakiye;
		
	}
	public double getbakiye() {
		return bakiye;
	}
	
	
	public void  setisim(String isim) {
		this.isim = isim;
	}
	public String getisim()
	{
		return isim;
	}
	
	
	public void setemail(String email) {
		this.email = email;
	}
	public String getemail() {
		return email;
	}
	
	public void settelno(String telno) {
		this.telno = telno;
	}
	public String gettelno() {
		return telno;
	}
	
	     
}