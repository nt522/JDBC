package DB_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_db_table_column {
	
	static final String DB_Add = "jdbc:mysql://localhost:3306/testdb11";
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {

		try(Connection conn = DriverManager.getConnection(DB_Add, USER, PASS);
				Statement st = conn.createStatement();
				)
		{
			String sql = "CREATE TABLE example1" +
					"(userid Text, " +
					"userpassword Text)";
			st.executeUpdate(sql);
			System.out.println("Table created in testdb11.......");
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
