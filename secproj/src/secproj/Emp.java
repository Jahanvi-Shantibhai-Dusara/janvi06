package secproj;

import java.util.Scanner;

public class Emp {

	public static void main(String[] args) {
		Employee em = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		em.setEid(id);
		System.out.println("Enter name: ");
		String name = sc.next();
		em.setEname(name);
		System.out.println(em);
		System.out.println(name);
		
		sc.close();
	}

}
