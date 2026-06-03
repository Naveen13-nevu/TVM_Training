package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transactions {
	
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Naveenkumar@13");
			
			con.setAutoCommit(false);
			
//			Debit
			
			
			String debitQuery = " update accounts set balance = balance -? where account_id=?";
			
			PreparedStatement Debitpst = con.prepareStatement(debitQuery);
			Debitpst.setDouble(1, 1000);
			Debitpst.setInt(2, 101);
			Debitpst.executeUpdate();
			
//			Credit
			String creditQuery = " update accounts set balance = balance +? where account_id=?";
			PreparedStatement Creditpst = con.prepareStatement(creditQuery);
			Creditpst.setDouble(1, 1000);
			Creditpst.setInt(2, 102);
			Creditpst.executeUpdate();
			
			con.commit();
			System.out.println("Payment sent successfully");
			
			con.close();
			Debitpst.close();
			Creditpst.close();
			
		
		} catch (SQLException e) {
			
			try {
				if(con != null) {
					con.rollback();
					System.out.println("Payment not sent successfull");
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
			
			e.printStackTrace();
		}
		
		
		
	}

}
