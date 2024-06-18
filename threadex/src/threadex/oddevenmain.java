package threadex;

public class oddevenmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OddNum o = new OddNum();
		EvenNum e = new EvenNum();
		
		Thread thread1 = new Thread(o);
		Thread thread2 = new Thread(e);
	
		thread1.start();
		thread2.start();
		
		try
		{
			thread1.join();
			thread2.join();
		}
		
		catch(InterruptedException e1)
		{
			e1.printStackTrace();
		}
		
		System.out.println("Complete");
	}

}
