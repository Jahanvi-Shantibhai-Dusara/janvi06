package interface_example;

public class TestTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		acc.setAccname("Dusara Jahanvi");
		acc.setEmail("janvi17@gmail.com");
		acc.setBalance(5000);
		
		Transaction tcs = new Transaction();
		tcs.deposit(acc, 3000);
		
		System.out.println(acc);
		
		tcs.withdraw(acc, 1000);
		
		System.out.println(acc);
	}

}

