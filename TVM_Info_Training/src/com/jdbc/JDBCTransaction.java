package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCTransaction {

    public static void main(String[] args) {

    	Connection con=null;
        try {

        	 con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "Naveenkumar@13");

            // Start Transaction
            con.setAutoCommit(false);

            // Debit from Account 101
            String debitSql =
                    "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";

            PreparedStatement debitStmt =
                    con.prepareStatement(debitSql);

            debitStmt.setDouble(1, 1000);
            debitStmt.setInt(2, 101);

            debitStmt.executeUpdate();

            // Credit to Account 102
            String creditSql =
                    "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

            PreparedStatement creditStmt =
                    con.prepareStatement(creditSql);

            creditStmt.setDouble(1, 1000);
            creditStmt.setInt(2, 102);

            creditStmt.executeUpdate();

            // Save changes permanently
            con.commit();

            System.out.println("Transaction Successful");

            debitStmt.close();
            creditStmt.close();

        } catch (Exception e) {

            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction Rolled Back");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();

        } finally {

            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}