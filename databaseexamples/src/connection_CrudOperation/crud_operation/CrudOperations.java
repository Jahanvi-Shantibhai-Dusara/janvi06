package connection_CrudOperation.crud_operation;
import java.sql.*;
import javax.sql.*;
import connection.Connection1;

public class CrudOperations {

	
	
	static Statement st;
	static Connection cn;
	
	public CrudOperations()
	{
		 cn = Connection1.getConnection();
		 try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertData(int id,String name)
	{
		String squery = "insert into stud values("+ id +" ,'"+ name +"')";
		try {
			int r = st.executeUpdate(squery);
			System.out.println(r);
			if(r>0)
			{
				System.out.println("Record inserted...");
			}
		} 
		catch(SQLIntegrityConstraintViolationException sq)
		{
			System.out.println("Can not duplicate id value");
		}
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void updateData(int id,String newName)
	{
		 String squery = "update stud set name = '" + newName + "' where id = " + id;
		    try {
		        int r = st.executeUpdate(squery);
		        if (r > 0) {
		            System.out.println("Record updated...");
		        } else {
		            System.out.println("Record not found...");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
	}
	
	public static void deleteData(int id)
	{
		String sq = "delete from stud where id = '"+ id +"'";
		try {
			int k = st.executeUpdate(sq);
			if(k>0)
			{
				System.out.println("Record deleted..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void searchData(int id)
	{
	String squery = "select * from stud where id = " + id;
    try {
        ResultSet r = st.executeQuery(squery);
        if (r.next()) {
            System.out.println("ID: " + r.getInt("id") + ", Name: " + r.getString("name"));
        } else {
            System.out.println("No record found with ID: " + id);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
	}
	
	public static void getData()
	{
		String sq = "select *from stud";
		try {
			ResultSet r = st.executeQuery(sq);
			
			while(r.next())
			{
				System.out.println(r.getString(1)+" "+r.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
