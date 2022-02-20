
import java.util.Scanner;

class Account {
	static long id;
	static double balance;
	public Account(long id, double balance) {
		Account.id = id;
		Account.balance = balance;
	}
	public static double withDraw(double Amount) {
		return balance-Amount;
	}
	@SuppressWarnings("unused")
	private static double deposit(double Amount) {
		return balance+Amount;
	}
	
}
@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
@SuppressWarnings("serial")
class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException(String msg) {
		super(msg);
	}
}
public class ExceptionQ3 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Account account =new Account(56789, 2000);
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter withDraw Amount :");
		Double withDrawAmount = scanner.nextDouble();
		scanner.close();
		try {
			
			if(withDrawAmount>Account.balance) {
				throw new InsufficientBalanceException("Insufficent Balance");
			}
			else if(withDrawAmount<-1) {
				throw new IllegalBankTransactionException("Illegal Bank Transaction");
			}
			else {
				System.out.println("Balance Amount: "+Account.withDraw(withDrawAmount));
			}

				
		} catch (InsufficientBalanceException e) {
			System.out.println(e);
		}
		catch (IllegalBankTransactionException e) {
			System.out.println(e);
		}
		

	}

}
