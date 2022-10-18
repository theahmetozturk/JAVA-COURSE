
public class Odevler {

	public static void main(String[] args) {
		int sayi1 = 10, sayi2 = 10;
		if (sayi1 > sayi2) {
			System.out.println(sayi1);
		} else if (sayi2 > sayi1) {
			System.out.println(sayi2);
		}
//*****************************************************************************************************************************************
		int num1 = 30, num2 = 5, num3 = 48;

		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println(num1 + ">" + num2 + ">" + num3);
			} else {
				System.out.println(num1 + ">" + num3 + ">" + num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println(num2 + ">" + num1 + ">" + num3);
			} else {
				System.out.println(num2 + ">" + num3 + ">" + num1);
			}

		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
				System.out.println(num3 + ">" + num1 + ">" + num2);
			} else {
				System.out.println(num3 + ">" + num2 + ">" + num1);
			}
		}
//******************************************************************************************************************************************
		
		
	}
}