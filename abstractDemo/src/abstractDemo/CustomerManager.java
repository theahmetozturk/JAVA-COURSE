package abstractDemo;

public class CustomerManager {
	
	BaseDataBaseManager dataBaseManger;
	
	public void getCustomers() {
		dataBaseManger.getData();
	}
}
