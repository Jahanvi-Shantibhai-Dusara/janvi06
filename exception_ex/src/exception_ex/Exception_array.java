package exception_ex;

public class Exception_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,result;
		
		a=12;
		
		try {
			int[] arr = {1,2,3,4,5,6,7,8};
			
			for(int i =0 ; i<8;i++)
			{
				result = a/arr[i];
				System.out.println("Result: "+result);
				
			}
			
			//int result1 = a/arr[7];
			//System.out.println(result1);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		}
		
		catch(Exception e2)
		{
			System.out.println("Number can not be "+e2.getMessage());
		}
	}

}
