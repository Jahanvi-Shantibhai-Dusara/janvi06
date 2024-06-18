package exception_ex;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank();
		b.setAccName("Janvi");
		b.setBalance(2000.0);
		
		b.withdraw(2100);
		System.out.println(b);
		//b.withdraw(1000);
		
	}

}
