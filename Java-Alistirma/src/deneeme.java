import java.util.Scanner;

public class deneeme {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Sat�r say�s�n� girin: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("S�tun say�s�n� girin: ");
        int sutunSayisi = scanner.nextInt();

        int[][] matris = new int[satirSayisi][sutunSayisi];

        System.out.println("Elemanlar� girin:");

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("Girilen matris:");

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println(); 
    }
        
        
        System.out.print("Sat�r say�s�n� girin: ");
        int satirSayisi1 = scanner.nextInt();

        System.out.print("S�tun say�s�n� girin: ");
        int sutunSayisi1 = scanner.nextInt();
        
       
	        

	        int[][] matris1 = new int[satirSayisi][sutunSayisi];

	        System.out.println("Elemanlar� girin:");

	        for (int i = 0; i < satirSayisi1; i++) {
	            for (int j = 0; j < sutunSayisi1; j++) {
	                System.out.print("[" + i + "][" + j + "]: ");
	                matris1[i][j] = scanner.nextInt();
	            }
	        }

	        
	        System.out.println("Girilen matris:");

	        for (int i = 0; i < satirSayisi1; i++) {
	            for (int j = 0; j < sutunSayisi1; j++) {
	                System.out.print(matris1[i][j] + " ");
	            }
	            System.out.println(); 
	    }
        

	        MatrisCarpma(matris,matris1);
		
	}

	
	
	
     
	public static void MatrisCarpma(int [][]matris,int [][]matris1) {
		int satirSayisi=matris.length;
	    int sutunSayisi=matris[0].length;
	    int satirSayisi1=matris1.length;
	    int sutunSayisi1=matris1[0].length;
	    
	    
	    int [][]matrisCarp�m = new int[satirSayisi][sutunSayisi1];
	    for(int i=0;i<satirSayisi;i++) {
	    	for(int j=0;j<sutunSayisi1;j++) {
	    		int toplam=0;
	    		for(int k=0; k<sutunSayisi; k++) {
	    			toplam+=matris[i][k]*matris1[k][j];
	    		}
	    		matrisCarp�m[i][j]=toplam;
	    	}
	    }
	    
	    System.out.println("Matris �arp�m�: ");
	    for(int i=0;i<satirSayisi;i++) {
	    	for(int j=0;j<sutunSayisi1;j++) {
	    		System.out.print(matrisCarp�m[i][j]+ " ");
	    	}
	    	System.out.println();
	    }
	}
	


		
	}
	