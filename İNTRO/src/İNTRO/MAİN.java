package İNTRO;

public class MAİN {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		String ortaMetin= "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		//System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.15;
		double dolarBugun = 18.15;
		
		boolean dolarDustuMu = true; //false da olabilir
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
				okYonu = "down.svg";
				//System.out.println(okYonu);
			
		}	else if(dolarBugun>dolarDun) {
				okYonu = "up.svg";
				//System.out.println(okYonu);
			
		}
		else {
				okYonu = "equal.svg";
				//System.out.println(okYonu);
			
		}
		
		// ARRAY
		
		String[] krediler = {"Hızlı Kredi","Mutlu Emekli","Maasını Halkbanktan"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
		
		
		
		}
}
