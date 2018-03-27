package com.telnet.mysqlprimer;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		JdbcSelectTest sel= new JdbcSelectTest();
		JdbcInsertTest ins= new JdbcInsertTest();
		JdbcUpdateTest upd= new JdbcUpdateTest();
		
		sel.Select();
		ins.Insert();
		upd.Update();

	}

}
