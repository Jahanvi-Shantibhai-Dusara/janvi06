package bufferedproj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Emp {

		
		public static void main(String[] args) throws IOException {
			Employee em = new Employee();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your name: ");
			String name = br.readLine();
			
			System.out.println(name);
			
		
		
		}
	}


