package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import beans.Cart;

public class CartDao {
public static int saveCart(Cart cart)
{
int save=0;
try {
	Connection con=DatabaseCon.getCon();
	PreparedStatement ps=con.prepareStatement("insert into products(productname,productbrand,quantity,price)values(?,?,?,?)");
	ps.setString(1,cart.getProductname());
	ps.setString(2,cart.getProductbrand());
	ps.setInt(3,cart.getQuantity());
	ps.setInt(4,cart.getPrice());
	save=ps.executeUpdate();
	con.close();
} catch (Exception e) {
	e.printStackTrace();
}
return save;
}

public static Cart getProductById(int id)
{
	Cart cart=new Cart();
	try {
		Connection con=DatabaseCon.getCon();
		PreparedStatement ps=con.prepareStatement("select * from products where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		if (rs.next()) {
			cart.setId(rs.getInt("id"));
			cart.setProductname(rs.getString("productname"));
			cart.setProductbrand(rs.getString("productbrand"));
			cart.setQuantity(rs.getInt("quantity"));
			cart.setPrice(rs.getInt("price"));
		}
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return cart;
}

public static int updateProduct(Cart cart)
{
	int update=0;
	try {
		Connection con=DatabaseCon.getCon();
		PreparedStatement ps=con.prepareStatement("update products set productname=?,productbrand=?,quantity=?,price=? where id=?");
		ps.setString(1,cart.getProductname());
		ps.setString(2,cart.getProductbrand());
		ps.setInt(3,cart.getQuantity());
		ps.setInt(4,cart.getPrice());
		ps.setInt(5,cart.getId());
		update=ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return update;
}

public static int deleteProduct(int id)
{
	int delete=0;
	try {
		Connection con=DatabaseCon.getCon();
		PreparedStatement ps=con.prepareStatement("delete from products where id=?");
		ps.setInt(1,id);
		delete=ps.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return delete;
}

public static ArrayList<Cart> getAllProducts()
{
ArrayList<Cart> list=new ArrayList<>();
try {
	Connection con=DatabaseCon.getCon();
	PreparedStatement ps=con.prepareStatement("select * from products");
	ResultSet rs=ps.executeQuery();
	while (rs.next()) {
		Cart cart=new Cart();
		cart.setId(rs.getInt("id"));
		cart.setProductname(rs.getString("productname"));
		cart.setProductbrand(rs.getString("productbrand"));
		cart.setQuantity(rs.getInt("quantity"));
		cart.setPrice(rs.getInt("price"));
		list.add(cart);
	}
	con.close();
} catch (Exception e) {
	e.printStackTrace();
}

return list;
	
}
}
