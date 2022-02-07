package ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import usingStatement.DBUtil1;

public class ResultSetClient {

	public static void main(String[] args) throws SQLException {
		Connection connection = DBUtil1.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
		
		  Statement st=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

		  ResultSet rs=st.executeQuery("select * from employee_table");
		  System.out.println("3rd record is");
		  rs.absolute(4);
		  System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));
			  System.out.println(rs.getString(3));
			  
			  rs.relative(-1);
			  System.out.println(rs.getInt(1));
	        System.out.println(rs.getString(2));
				  System.out.println(rs.getString(3));
				  
				  //update 1st record
				  rs.absolute(1);
				  rs.updateString(2, "Geeta");
				  rs.updateRow();
				  
				  try { 
					  connection.close(); 
					  st.close(); } 
				  catch(Exception e) {
				  System.out.println(e); }
	}

}
