package com.telnet.mysqlprimer;
import java.sql.*; 

public class JdbcSelectTest{

	public void Select() throws SQLException {
		
		Statement stmt = Connector.conStat().createStatement();
			
			
			String sqlSelect= "select title, price, qty from books";
			System.out.println("The SQL query is:"+sqlSelect);
			System.out.println();
			
			ResultSet rset= stmt.executeQuery(sqlSelect);
			
			System.out.println("The record selected are");
			int rowCount= 0;
			while (rset.next()) {
				String title= rset.getString("title");
				double price= rset.getDouble("price");
				int qty= rset.getInt("qty");
				System.out.println(title+ ", "+ price+ ", "+ qty);
				++rowCount;
			}
			 System.out.println("Total number of records = " + rowCount);
		
		
		
	}
	
}

