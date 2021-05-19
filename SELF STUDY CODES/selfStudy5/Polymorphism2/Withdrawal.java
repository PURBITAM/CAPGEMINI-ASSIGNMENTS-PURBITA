package selfStudy5.Polymorphism2;

public class Withdrawal extends Transaction
{
	private double amount;
	private double amt;
	
	public Withdrawal(double amount,double amt) {
	super();
	this.amount = amount;
	this.amt=amt;
}

	public double execute()
	{
		return (amount-amt);
	}
}
