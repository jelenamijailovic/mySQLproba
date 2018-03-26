package mysqlPrimer;
import java.sql.*;

public class JdbcUpdateTest {

	public static void main(String[] args) {
		try(
				Connection conn= DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "root", "qqq");
				Statement stmt= conn.createStatement();
				)
		{
			String sqlUpdate= "update books set price= price*0.7, qty= qty+1 where id= 1001";
			System.out.println("The SQL query is:"+ sqlUpdate);
			int countUpdated= stmt.executeUpdate(sqlUpdate);
			System.out.println(countUpdated+"records affected.");
			
			String strSelect= "select * from books where id=1001";
			System.out.println("The SQL query is:"+ strSelect);
			ResultSet rset= stmt.executeQuery(strSelect);
			while(rset.next()){
				System.out.println(rset.getInt("id")+", "+ 
				rset.getString("author")+", "+
				rset.getString("title")+ ", "+
				rset.getDouble("price")+", "+
				rset.getInt("qty"));
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
