package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableJDBC {
	public static void main(String[] args) {
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Naveenkumar@13");
			CallableStatement cs = con.prepareCall("{call InsertEmployee(?,?,?,?,?,?)}");
			
			cs.setInt(1, 210);
			cs.setString(2, "Naveen");
			cs.setInt(3, 85000);
            cs.setString(4, "Backend Developer");
            cs.setString(5, "Coimbatore");
            cs.setString(6, "arul@gmail.com");
            
            cs.execute();

            System.out.println("2 rows inserted successfully");
            cs.close();
            con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
