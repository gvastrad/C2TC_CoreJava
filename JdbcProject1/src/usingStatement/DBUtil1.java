package usingStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil1 {
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="admin";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/jdbcdb";
	
	private static Connection connection = null;
	static{
		try {
			Class.forName(DB_DRIVER_CLASS);
connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}	
	public static Connection getConnection(){
		return connection;
	}
}
