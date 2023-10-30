package DB_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_data_insert {
	
	static final String DB_Add = "jdbc:mysql://localhost:3306/testdb11";
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {

		try(Connection conn = DriverManager.getConnection(DB_Add, USER, PASS);
				Statement st = conn.createStatement();
				)
		{
			String sql = "INSERT into example1 values('UserKP', 'pass1134')";
			st.executeUpdate(sql);
			System.out.println("Data inserted in example1.......");
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
