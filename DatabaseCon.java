package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseCon {
public static Connection getCon()
{
	Connection con=null;
try {
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cart","root","root");
PreparedStatement ps=con.prepareStatement("insert into products(productname,productbrand,quantity,price)values(?,?,?,?)");

	
} catch (Exception e) {
	// TODO: handle exception
}
return con;
}
}
