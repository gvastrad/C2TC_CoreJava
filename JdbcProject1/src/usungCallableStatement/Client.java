package usungCallableStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;

public class Client {
	static CallableStatement cs=null;
	static Statement st=null;
	public static void main(String[] args) throws SQLException {

		Connection connection = DbUtil2.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
		try {
			String sql="CREATE DEFINER=`root`@`localhost` PROCEDURE `p1`()\r\n"
					+ "BEGIN\r\n"
					+ "INSERT INTO `jdbcdb`.`employee_table`(`employee_id`,`employee_name`,`email`,`esalary`,`bonus`,`doj`)\r\n"
					+ "VALUES(8,'Sharath','sharath@gmail.com',6000,3000,'2022-03-03');\r\n"
					+ "INSERT INTO `jdbcdb`.`employee_table`(`employee_id`,`employee_name`,`email`,`esalary`,`bonus`,`doj`)\r\n"
					+ "VALUES(5,'Sahana','sahana@gmail.com',6000,3000,'2022-03-03');\r\n"
					+ "INSERT INTO `jdbcdb`.`employee_table`(`employee_id`,`employee_name`,`email`,`esalary`,`bonus`,`doj`)\r\n"
					+ "VALUES(7,'anand','anand@gmail.com',6000,3000,'2022-03-03');\r\n"
					+ "END";
			
			  st=connection.createStatement();
			  int i=st.executeUpdate(sql);
			 
			cs=(CallableStatement) connection.prepareCall("{call p1()}");
			int i1=cs.executeUpdate();
			System.out.println(i1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		  try { 
			  connection.close(); 
			  cs.close(); 
			  } 
		  catch(Exception e) {
		  System.out.println(e); }
		}

}
