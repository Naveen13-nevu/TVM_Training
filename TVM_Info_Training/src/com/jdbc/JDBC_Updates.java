package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Updates {

	public static void main(String[] args) {
		
		try {
			
//			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Naveenkumar@13");
			
			String sql = "select * from employees ";
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			
//			pst.setInt(1, 20000);
//			pst.setInt(2, 1);
			
//			int row = pst.executeUpdate();
//			System.out.println(row + " row affected");
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				System.out.println(
						rs.getInt("EmpId") + " | " +
						        rs.getString("EmpName") + " | " +
						        rs.getInt("Salary") + " | " +
						        rs.getString("Dept") + " | " +
						        rs.getString("City") + " | " +
						        rs.getString("Email")
						);
			}
//			
//			pst.setInt(1, 204);
//            pst.setString(2, "arul");
//            pst.setInt(3, 85000);
//            pst.setString(4, "Backend Developer");
//            pst.setString(5, "Coimbatore");
//            pst.setString(6, "arun@gmail.com");
//            pst.addBatch();
//
//           
//            pst.setInt(1, 205);
//            pst.setString(2, "mani");
//            pst.setInt(3, 95000);
//            pst.setString(4, "Data Analyst");
//            pst.setString(5, "Bangalore");
//            pst.setString(6, "karthik@gmail.com");
//            pst.addBatch();
//            
//            int [] result = pst.executeBatch();
            
//            System.out.println(result.length+" rows inserted successfully");
			
            pst.close();
            con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
