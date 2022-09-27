package uygulamalar;

public class main {

	private static int ı;
	private static int e;

	public static void main(String[] args) {
		//System.out.println("Merhaba Java");
				//String = "" yazılarak değişkenler kolaylıkla değiştirilebilir.
				
						int OgrenciSayım = 19;
						
		//System.out.println("OgrenciSayısı : "+OgrenciSayım);
		//System.out.println("OgrenciSayısı : "+OgrenciSayım);
		//System.out.println("OgrenciSayısı : "+OgrenciSayım);
		//System.out.println("OgrenciSayısı : "+OgrenciSayım);
		
		int sayi=20;
		
		if(sayi<20) {
			//System.out.println("Sayı 20 den küçüktür.");
		}else if(sayi==20) {
			//System.out.println("Sayı 20 ye eşittir.");
			
		}else {
			//System.out.println("Sayı 20 den büyüktür.");
		}
		
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBüyük = sayi1;
		if(enBüyük<sayi2) {
			enBüyük = sayi2;
		}
		if(enBüyük<sayi3) {
			enBüyük = sayi3;
					
		}
		//System.out.println("en büyük = "+enBüyük);
		
		
		char grade = 'S';
		switch (grade) {
			case 'A':
				//System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
				//System.out.println("Çok güzel : Geçtiniz");
				break;	
			case 'C':
				//System.out.println("iyi : Geçtiniz");
				break;	
			case 'D':
				//System.out.println("Fena Değil : Geçtiniz");
				break;
			case 'F':
				//System.out.println("Maalesef : Kaldınız");
				break;
			default:
				//System.out.println("Geçersiz not girdiniz");
		}
		
		
		
		
		
		
		
		
		for(int i=1;i<10;i++){
			//System.out.println(i);	
			
		}
		//System.out.println("Döngü Bitti");
		
		
		
		
		int j=100;
		do {
			//System.out.println(j);
			j+=2;
		}while(j<10);
		
		

		
		
		
		
		
		String[] ogrenciler= new String[4];
		ogrenciler[0]= "Ali";
	    ogrenciler[1]= "Ahmet";	
	    ogrenciler[2]= "Suna";
	    ogrenciler[3]= "Veli";
	    
	    for(int k=0;k<ogrenciler.length;k++) {
	    	
	    	//System.out.println(ogrenciler[k]);
	    }	
	    
	    
	    //Daha iyi ve temiz olan kod.
	    
	    for(String ogrenci:ogrenciler) {
	    	//System.out.println(ogrenci);
	    	
	    }	
	    	
	    
	    double[] mylist = {1.2, 1.3, 4.3, 5.6};
	    double total=0;
	    double max = mylist[0];
	    for(double number: mylist){
	    	if(max < number) {
	    		max = number;
	    		
	    	}
	    	total= total+number;
	    	//System.out.println(number);
	
	    }
	    //System.out.println("Toplam= "+total);
	    //System.out.println("En büyük = "+max);
	    
	    
	    
	    
	    
	    
	    
	}								
}


