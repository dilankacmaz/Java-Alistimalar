
public class AccountMain {

	public static void main(String[] args) {
		
		Account account1 = new Account("12345", 500,"dilan","dila@email","728387");  
	    Account  account2 = new Account();
        account1.ParaCekme(200);
        account1.ParaYatýr(200);
        
        
      System.out.println(account2.getisim());  
}
}