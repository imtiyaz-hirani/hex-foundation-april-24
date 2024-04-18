package com.dao;

import java.sql.*;

public class DBConfig {
	/* step 1: create connection variables */
	String userDB="root";
	String passDB="";
	String url="jdbc:mysql://localhost:3306/ticketbooking_feb_hex_24";
	String driver="com.mysql.cj.jdbc.Driver";
	Connection con; 
	
	public void dbConnect() {
		/*Step 2: load the driver */
		try {
			Class.forName(driver);
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not loaded...");
			e.printStackTrace();
		}
		
		/* Step 3: Establish the connection */
		try {
			con = DriverManager.getConnection(url, userDB, passDB);
			System.out.println("connection established");
		} catch (SQLException e) {
			System.out.println("connection failed");
			e.printStackTrace();
		}
	}
	
	public void dbClose() {
		try {
			con.close();
			System.out.println("Connection closed ");
			} catch (SQLException e) {
			System.out.println("Connection could not be closed"); 
		}
	}
	
	public static void main(String[] args) {
		DBConfig dbCon = new DBConfig();
		dbCon.dbConnect();
		dbCon.dbClose();
	}
}
