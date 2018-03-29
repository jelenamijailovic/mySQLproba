package com.telnet.mysqlprimer;

import java.sql.*;

public class Connector{

	
	public static Connection conStat(){
	Connection conn = null;
	try {
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "root", "qqq"
				);
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return conn;
	}
}
