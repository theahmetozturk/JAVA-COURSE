
public class Mükemmelsayı {

	public static void main(String[] args) {
		int number = -5;
		int total = 0;
		
		if(number==1) {
			System.out.println("Geçersiz bir sayı girdiniz");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz bir sayı girdiniz");
			return;
		}
		
		
		
		for(int i=1;i<number;i++) {
			if(number % i ==0) {
				total = total+ i;
				
			}
		}
		if(number==total) {
			System.out.println("Mükemmel sayıdır");
		}else {
			System.out.println("Mükemmel sayı değildir");
		}
		
		
		
		
		
		
		
		
		
	}

}
