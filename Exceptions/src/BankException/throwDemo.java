package BankException;

public class throwDemo {

	public static void main(String[] args) {
		AccountManager manager = new AccountManager();

		manager.deposit(100);
		System.out.println("Account: " + manager.getBalance());
		try {
			manager.withdraw(110);
		} catch (BalanceInsufficentExcepiton exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println("Account: " + manager.getBalance());
	}
}
