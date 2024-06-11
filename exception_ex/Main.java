package exception_ex;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			int result = a/b;
			System.out.println("a and b result is: "+result);
			sc.close();
		}
		
		catch(Exception e) {
			
			System.out.println("Number can not be "+e.getMessage());
		}
	}

}
