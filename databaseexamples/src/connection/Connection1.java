package connection;
import java.sql.*;
import javax.sql.*;


public class Connection1 {

	public static final String  username="root";
	public static final String password="W7301@jqir#";
	public static final String url = "jdbc:mysql://localhost:3306/student";
	static Connection cn = null;
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				cn = DriverManager.getConnection(url,username,password);
				
				
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return cn;
	}
}
