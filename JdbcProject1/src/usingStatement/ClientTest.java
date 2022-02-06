package usingStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest {
	public static void main(String[] args) throws SQLException {

		Connection connection = DBUtil1.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
		
		  Statement st=connection.createStatement();
			/*
			 * String sql="select * from employee_table";
			 * 
			 * ResultSet rs=st.executeQuery(sql);
			 * 
			 * while(rs.next()) { System.out.println(rs.getInt(1));
			 * System.out.println(rs.getString(2)); System.out.println(rs.getString(3));
			 * System.out.println(rs.getInt(4));
			 * 
			 * }
			 */
		 
	 
		
		  String sql="insert into employee_table(employee_id," +
		  "employee_name,email,esalary,bonus,doj) values(3,'sejal','sejal@gmail.com',40000,3000,'2022-03-23')" ;
		  int n=st.executeUpdate(sql); 
		  System.out.println(n + "row"+ "afftected");
		 
		
		  try { 
			  connection.close(); 
			  st.close(); } 
		  catch(Exception e) {
		  System.out.println(e); }
		 
		}


}
