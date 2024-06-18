package synchronization;

public class increment {

	int cnt;
	
	public synchronized void get_Increment()
	{
		cnt++;
	}
}
