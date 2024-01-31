
public class idman {
private int burpee_sayisi;
private int pushup_sayisi;
private int situp_sayisi;
private int squat_sayisi;


public idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi,int squat_sayisi){
	this.burpee_sayisi = burpee_sayisi;
	this.pushup_sayisi = pushup_sayisi;
	this.situp_sayisi = situp_sayisi;
	this.squat_sayisi = squat_sayisi;
	
	
}

public void setburpee(int burpee_sayisi) {
	this.burpee_sayisi = burpee_sayisi;
}
public int getburpee() {
	return burpee_sayisi;
}
public void setpushup(int pushup_sayisi) {
	this.pushup_sayisi = pushup_sayisi;
	
}
public int getpushup(){
	return pushup_sayisi = pushup_sayisi;
}
public void setsitup(int situp_sayisi) {
	this.situp_sayisi = situp_sayisi;
}
public int getsitup() {
	return situp_sayisi;
}
public void setsquat(int squat_sayisi) {
	this.squat_sayisi = squat_sayisi;
}
public int getsquat() {
	return squat_sayisi;
}


public void hareketYap(String hareketturu, int sayi) {
	if(hareketturu.equals("burpee")) {
		burpeeYap(sayi);
	}
	else if(hareketturu.equals("pushup")) {
		pushupYap(sayi);
	}
	else if (hareketturu.equals("situp")) {
		situpYap(sayi);
	}
	else if(hareketturu.equals("squat")) {
		squatYap(sayi);
		
	}
	else {
		System.out.println("geçersiz");
	}
}

public void burpeeYap(int sayi) {
	if(burpee_sayisi == 0) {
		System.out.println("yapacak hareket yok");
	}
	if(burpee_sayisi - sayi< 0) {
		System.out.println("hedeflenen sayıyı geçtin tebrikler");
		burpee_sayisi=0;
		System.out.println("kalan: "+ burpee_sayisi);
	}
	else {
		burpee_sayisi -= sayi;
		System.out.println("kalan: "+ burpee_sayisi);
	}
}

public void pushupYap(int sayi) {
	if(pushup_sayisi == 0) {
		System.out.println("yapacak hareket yok");
	}
	if(pushup_sayisi - sayi< 0) {
		System.out.println("hedeflenen sayıyı geçtin tebrikler");
		pushup_sayisi=0;
		System.out.println("kalan: "+ pushup_sayisi);
	}
	else {
		pushup_sayisi -= sayi;
		System.out.println("kalan: "+ pushup_sayisi);
	}
}


public void situpYap(int sayi) {
	if(situp_sayisi == 0) {
		System.out.println("yapacak hareket yok");
	}
	if(situp_sayisi - sayi< 0) {
		System.out.println("hedeflenen sayıyı geçtin tebrikler");
		situp_sayisi=0;
		System.out.println("kalan: "+ situp_sayisi);
	}
	else {
		situp_sayisi -= sayi;
		System.out.println("kalan: "+ situp_sayisi);
	}
}


public void squatYap(int sayi) {
	if(squat_sayisi == 0) {
		System.out.println("yapacak hareket yok");
	}
	if(squat_sayisi - sayi< 0) {
		System.out.println("hedeflenen sayıyı geçtin tebrikler");
		squat_sayisi=0;
		System.out.println("kalan: "+ squat_sayisi);
	}
	else {
		squat_sayisi -= sayi;
		System.out.println("kalan: "+ squat_sayisi);
	}
}


public boolean idmanBittiMi() {
	return (burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
}

}























