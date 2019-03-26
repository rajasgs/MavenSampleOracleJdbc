package org.rj;

import java.sql.*; 

public class Oracle11GDebianTest {

	private final static String DB_URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private final static String USER = "SYSTEM";
	private final static String PASS = "oracle";

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Connected");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// ignore
				}
			}
		}
	}

}
