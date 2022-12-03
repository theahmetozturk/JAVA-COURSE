import java.util.HashMap;

public class hashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> sozluk = new HashMap<String, String>();  // Referans tip farklı olabilir.
		
		sozluk.put("book", "kitap");
		sozluk.put("table", "masa");
		sozluk.put("computer", "bilgisayar");
		sozluk.put("apple", "elma");
		
		
		//System.out.println(sozluk);
		
		for ( String item : sozluk.keySet()){
			System.out.println("Eleman-"+item+"  Değer-"+sozluk.get(item));
		}

	}

}
