package h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UseH2 {

	public static void main(String[] args) {

		
		try {
			Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = conn.createStatement() ;
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
