package connection_CrudOperation.crud_operation;

public class DemoCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stud s = new Stud();
		s.setId(107);
		s.setName("Kinjal");
		Stud s1 = new Stud("Nency",108);
		
		CrudOperations cr = new CrudOperations();
		
		
		CrudOperations.insertData(s.getId(),s.getName());
		CrudOperations.insertData(s1.getId(),s1.getName());
		//CrudOperations.deleteData(105);
		CrudOperations.getData();
		CrudOperations.updateData(101, "Maan");
		CrudOperations.searchData(106);
		
	}

}
