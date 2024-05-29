package hire_proj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.setName("Janvi");
		emp.setAge(20);
		emp.setPhoneNumber("99782437452");
		emp.setAddress("Ahmedabad");
		emp.setSalary(30000.00);
		emp.setSpecialization("Administrator");
		
		System.out.println(emp);

		Manager mng = new Manager();
		mng.setName("Janvi");
		mng.setAge(20);
		mng.setPhoneNumber("99782437452");
		mng.setAddress("Ahmedabad");
		mng.setSalary(30000.00);
		mng.setDept("XYZ");
		
		System.out.println(mng);
	}

}
