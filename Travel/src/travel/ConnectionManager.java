package travel;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionManager {
	public Connection connection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","");  
		if (con != null)
		{
			System.out.println("Connected");
		}
		else
		{
			System.out.println("Not Connected");
		}
		
		return con;
	}

}
