package com.tns.jdbccrud.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tns.jdbccrud.dao._Using_Statement;

public class Service {
	PreparedStatement pst;
	Statement st;
	Connection con;
	
	public Service() throws SQLException {
		this.con = _Using_Statement.getConnectionObject();
		this.st = con.createStatement();
	}
	//Using Prepared statement
	public void addStudent() throws SQLException
	{
		String sql="insert into student(sid,sname,course) values(106,'Rohith Kumar','MECH')";
		this.pst=con.prepareStatement(sql);
		int row=pst.executeUpdate();
		System.out.println(row + "row"+ "afftected");
	}
	
	public void getStudents() throws SQLException{
		String sql="select * from student";
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
	}
	public void updateStudent() throws SQLException{
		String sql="update student set branch='cs' where sid=103 ";
		int b=st.executeUpdate(sql);
		//System.out.println(b);
		
			System.out.println(b+"  row affected");
	}
  public void deleteStudnet() throws SQLException{
	  String sql="delete from student where sid=102";
		int i=st.executeUpdate(sql);
		System.out.println(i+"  row affected");
  }
  public void closeSession()
  {
  	try { 
  		  con.close(); 
  		  st.close();
  		  } 
  	  catch(Exception e) {
  	  System.out.println(e); }  
  }
}
