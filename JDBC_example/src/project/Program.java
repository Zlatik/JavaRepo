package project;
import java.sql.*;

public class Program {
	public static void main(String [] args) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/artemwebstore?autoReconnect=true&useSSL=false","root","root");
			if(con == null) {
			System.out.println("Smtn wrong");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from customers");
		while(rs.next()) {
			System.out.println(String.format("%d %s %s", rs.getRow(),rs.getString("CName"),rs.getString("Contacts")));
		}
			stmt.close();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally{
			if(con != null) {
				con.close();
			}
		}
	}
}