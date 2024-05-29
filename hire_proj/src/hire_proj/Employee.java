package hire_proj;

public class Employee extends Member {

	private String specialization;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Name = " + getName() + "Age = " + getName() + "Phone number = " + getPhoneNumber() +
				"Address = " + getAddress() + "Salary = " + getSalary() + "specialization = " + specialization;
	}
	
	
}
