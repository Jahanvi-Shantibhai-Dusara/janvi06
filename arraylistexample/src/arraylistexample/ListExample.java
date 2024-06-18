package arraylistexample;
import java.util.*;


public class ListExample {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		System.out.println(l1);
		
		int sum = 0;
		for(int num : l1)
		{
			if(num % 2 == 0)
			{
				System.out.println(num);
				sum += num;
			}
		}
		
		l1.forEach(v -> System.out.println(v));

		System.out.println("Total: "+sum);
		

	}

}
