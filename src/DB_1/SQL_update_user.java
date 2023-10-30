package DB_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_update_user {
	
	static final String DB_Add = "jdbc:mysql://localhost:3306/testdb11";
	static final String USER = "root";
	static final String PASS = "root";
	static final String Q = "SELECT * FROM testdb11.example1";

	public static void main(String[] args) {

		try(Connection conn = DriverManager.getConnection(DB_Add, USER, PASS);
				Statement st = conn.createStatement();
				)
		{
			String sql = "UPDATE example1 SET userpassword = '00100' WHERE userid = 'UserNT'";
			st.executeUpdate(sql);
			ResultSet rs = st.executeQuery(Q);
			
			while(rs.next()) {
				System.out.println("User ID: " + rs.getString("userid"));
				System.out.println(", User Password: "+ rs.getString("userpassword"));
				
			}
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
