package usungCallableStatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil2 {
	private static final String DB_DRIVER_CLASS="driver.class.name";
	private static final String DB_USERNAME="db_username";
	private static final String DB_PASSWORD="db_password";
	private static final String DB_URL ="db.url";
	
	private static Connection connection = null;
	private static Properties properties=null;
	static{
		try {
			
			properties=new Properties();
		properties.load(new FileInputStream("src/database.properties"));
		Class.forName(properties.getProperty(DB_DRIVER_CLASS));
connection = DriverManager.getConnection(properties.getProperty(DB_URL),properties.getProperty(DB_USERNAME) , properties.getProperty(DB_PASSWORD) );

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	public static Connection getConnection(){
		return connection;
	}
}

