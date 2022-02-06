import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBExample {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:Emp");
			st=con.createStatement();
			String sql="select * from Login";
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				 System.out.println(rs.getString(1));
				 System.out.println(rs.getString(2));
			}
			
		}
       catch(Exception e)
		{
    	   System.out.println(e);
		}
		finally
		{
			try
			{
				con.close();
				st.close();
			}
			catch(Exception e)
			{
	    	   System.out.println(e);
			}
		}

	}

}
