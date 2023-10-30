package DB_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_Test {
	
	static final String DB_Add = "jdbc:mysql://localhost:3306/mysql";
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {

		try(Connection conn = DriverManager.getConnection(DB_Add, USER, PASS);
				Statement st = conn.createStatement();
				)
		{
			String sql = "CREATE DATABASE testdb11";
			st.executeUpdate(sql);
			System.out.println("Database created succesfully.......");
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
