package exception_ex;

public class Bank {

	private String accName;
	private double balance;
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amt)
	{
		try
		{
			this.balance = this.balance-amt;
			if(balance < 1000)
			{
				throw new LowBalanceException("balance must be > 1000");
			}
		}
		catch(LowBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public String toString() {
		return "Bank [accName=" + accName + ", balance=" + balance + "]";
	}
	
	
	
}
