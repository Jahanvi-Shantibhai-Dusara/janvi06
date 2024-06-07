package exception_ex;

public class CatchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int[] a = new int[5];
			a[5] = 30/5;
			
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception caught: "+e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught: "+e1.getMessage());
		}
	}

}
