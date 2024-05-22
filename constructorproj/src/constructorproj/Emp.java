package constructorproj;

public class Emp {

	public static void main(String[] args) {
		
		Employee e = new Employee("Sakshi","Sakshi4@gmail.com");
		
		System.out.println(e);
		
		e.setName("janvi");
		e.setEmail("Janvi@gmail.com");
		
		System.out.println("name is: "+e.getName());
		
		System.out.println("email is: "+e.getEmail());
	}

}
