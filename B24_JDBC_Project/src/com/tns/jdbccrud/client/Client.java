package com.tns.jdbccrud.client;

import java.sql.SQLException;

import com.tns.jdbccrud.service.Service;

public class Client {

	public static void main(String[] args) throws SQLException {
		Service service=new Service();
        //service.addStudent();
        //service.getStudents();
       // service.updateStudent();
       // service.deleteStudnet();
		service.storedProcedure();
        //service.closeSession();
	}

}
