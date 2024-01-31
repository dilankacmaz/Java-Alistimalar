package alistirmalar;

import java.util.Random;

public class RandomEnBüyük {

	public static void main(String[] args) {
      Random rastgele=new Random();
      int sayi1 =rastgele.nextInt(100);
      int sayi2= rastgele.nextInt(100);
      int sayi3=rastgele.nextInt(100);
      System.out.println(sayi1+" "+sayi2+" "+sayi3);
      
      
      
      System.out.println(Metot( sayi1,sayi2,sayi3));
      
      
	}
	public static  int Metot(int sayi1,int sayi2,int sayi3) {
   	 int  enbuyuk=sayi1;
   	  if(sayi2>=sayi1 && sayi2>= sayi3) {
   		  enbuyuk=sayi2;
   		  
   	  }
   	  else if(sayi3>=sayi1 && sayi3>= sayi2) {
   		  enbuyuk=sayi3;
   		  
   	  }
   	  else {
   		  enbuyuk=sayi1;
   	  }
   	  return enbuyuk;
     }

}
