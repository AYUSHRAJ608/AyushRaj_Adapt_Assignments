package scq3;


public class BankAccountRepositoryImpl implements  BankAccountRepository {

    private BankAccount bankAccount1;
    private BankAccount bankAccount2;

 
    public BankAccountRepositoryImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount getBankAccount1() {
		return bankAccount1;
	}

	public void setBankAccount1(BankAccount bankAccount1) {
		this.bankAccount1 = bankAccount1;
	}

	public BankAccount getBankAccount2() {
		return bankAccount2;
	}

	public void setBankAccount2(BankAccount bankAccount2) {
		this.bankAccount2 = bankAccount2;
	}

	public BankAccountRepositoryImpl(BankAccount bankAccount1, BankAccount bankAccount2) {
		super();
		this.bankAccount1 = bankAccount1;
		this.bankAccount2 = bankAccount2;
	}

	@Override
    public double getBalance(long accountId) {

        if(this.bankAccount1.getAccountId()== accountId){
           return bankAccount1.getAccountBalance();
        }
        else{
           return  bankAccount2.getAccountBalance();
        }


    }

    @Override
    public double updateBalance(long accountId, double newBalance) {

        double updatedBal=0;
         if(this.bankAccount1.getAccountId()==accountId){
             updatedBal = newBalance;
             bankAccount1.setAccountBalance(updatedBal);
         }
         else{
             updatedBal = newBalance;
             bankAccount2.setAccountBalance(updatedBal);
         }

        return updatedBal;
    }
}