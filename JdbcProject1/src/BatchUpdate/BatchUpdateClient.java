package BatchUpdate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import usingStatement.DBUtil1;

public class BatchUpdateClient {
	public static void main(String[] args) throws SQLException {

		Connection connection = DBUtil1.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
		
		  Statement st=connection.createStatement();
		
		  String sql1="INSERT INTO employee_table(employee_id,employee_name,email,esalary,bonus,doj)"+
				 "VALUES(11,'Sharath','sharath@gmail.com',6000,3000,'2022-03-03')";
		  st.addBatch(sql1);
		  String sql2="update employee_table set employee_name='Abhishek' where employee_id=11";
		  st.addBatch(sql2);
		String sql3="delete  from employee_table where employee_id=10"; 
		st.addBatch(sql3);
		int i[]=st.executeBatch();
		for(int j=0;j<i.length;j++)
		{
			System.out.println(j);
		}
		  try { 
			  connection.close(); 
			  st.close(); } 
		  catch(Exception e) {
		  System.out.println(e); }
		 
		}
}
