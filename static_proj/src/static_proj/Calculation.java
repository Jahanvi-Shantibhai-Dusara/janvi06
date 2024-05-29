package static_proj;

public class Calculation {

	static int count=0;
	int ct=0;
	
	public Calculation()
	{
		count++;
		ct++;
	}

	@Override
	public String toString() {
		return "Count = " + count + "ct = " + ct;
	}
	
	
	
}
