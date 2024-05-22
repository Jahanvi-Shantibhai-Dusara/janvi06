package constructorproj;

public class Employee {

	private String name,email;
	
	public Employee() {
		
		this.name = "janvi";
		this.email = "janvi123@gmail.com";
	}

	public Employee(String name, String email) {
		
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}
