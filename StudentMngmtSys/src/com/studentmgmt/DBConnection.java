package com.studentmgmt;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con;

	public static Connection createDBConnection() {
		try {		
			String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
			String username = "root";
			String password = "#Deepika@1208";
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
