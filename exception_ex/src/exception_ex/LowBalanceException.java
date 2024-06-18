package exception_ex;

public class LowBalanceException extends Exception {

	public LowBalanceException(String msg)
	{
	System.out.println(msg);
	}
}
