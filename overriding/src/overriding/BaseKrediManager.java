package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {		//Double dan önce "Final" yazarsam inheritance eden class larda sadece bu değer geçerli olur.
		return tutar*1.18;
	}
}
