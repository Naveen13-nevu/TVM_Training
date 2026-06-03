 package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableInAndOut {
	
	private static final String Url ="jdbc:mysql://localhost:3306/testdb";
	private static final String User ="root";
	private static final String Password ="Naveenkumar@13";
	

	public static void main(String[] args) {

		try {
			
			Connection con = DriverManager.getConnection(Url,User,Password);
			CallableStatement cs = con.prepareCall("{call EmployeeInfo(?,?,?,?,?,?,?)}");
			
			 cs.setInt(1, 222);
	            cs.setString(2, "afrin");
	            cs.setInt(3, 90000);
	            cs.setString(4, "Java Developer");
	            cs.setString(5, "Chennai");
	            cs.setString(6, "naveen@gmail.com");
	            
	            cs.registerOutParameter(7, Types.VARCHAR);
	            cs.executeUpdate();
	            String message = cs.getString(7);
	            
	           System.out.println(message);
	            cs.close();
	            con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
