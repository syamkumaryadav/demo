package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbutil {
//SINGLETEN DESIGN PATTEREN
	static {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		public static Connection getConnection() {
			Connection connection=null;
		
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","gokada","syam");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
		}
}


