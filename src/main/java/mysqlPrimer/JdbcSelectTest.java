package mysqlPrimer;
import java.sql.*; 

public class JdbcSelectTest{

	public static void main(String[] args) {
		
		try(
				Connection conn= DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "root", "qqq"
						);
				Statement stmt= conn.createStatement();
				){
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
		}catch(SQLException ex) {
	         ex.printStackTrace();
	         
	      }
		
	}
	
}

