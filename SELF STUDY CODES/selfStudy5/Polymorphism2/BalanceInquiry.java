package selfStudy5.Polymorphism2;

public class BalanceInquiry extends Transaction
{
	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public BalanceInquiry(double balance) {
		super();
		this.balance = balance;
	}

	public double execute()
	{
		//System.out.println("Balance is : "+balance);
		return balance;
	}
}
