
public class Problem {

	public static class Matematik{
		public static void daireAlan(int yaricap) {
			System.out.println("daire alaný: "+(Math.PI*yaricap*yaricap));
		}
		
		public static void ucgenCevresi(int kenar1,int kenar2,int kenar3) {
			System.out.println("üçgen çevresi: "+(kenar1+kenar2+kenar3));
			
		}
	}
	
public static class Fizik{
		
		public static void icCarpim(Vec vec1,Vec vec2) {
			int iccarpim = vec1.geti() * vec2.geti() +vec1.getj()*vec2.getj()+vec1.getk()*vec2.getk();		
	        System.out.println(vec1.getisim()+ " ile "+ vec2.getisim()+ " in iç çarpýmý :"+ iccarpim);
	
		}
}
	
}