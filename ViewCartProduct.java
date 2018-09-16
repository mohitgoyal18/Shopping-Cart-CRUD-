package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Cart;
import dao.CartDao;
@WebServlet("/viewAllCart")
public class ViewCartProduct extends HttpServlet{
 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'>");
	out.println("<style>");
	out.println("table{border-collapse:collapse;width:100%;}");
	out.println("th,td{text-align:left;padding:8px;}");
	out.println("tr:nth-child(even){background-color:#f2f2f2}");
	out.println("th{background-color:#4caf50;color:white;}");
	out.println("</style>");
	out.println("<body>");
	out.println("<h1>Cart Product</h1>");
	ArrayList<Cart> list=CartDao.getAllProducts();
	out.println("<table class='table table-striped table-hover table-bordered'>");
	out.println("<tr>");
	out.println("<th>ProductName</th>");
	out.println("<th>ProductBrand</th>");
	out.println("<th>Quantity</th>");
	out.println("<th>Price</th>");
	out.println("<th>Edit</th>");
	out.println("<th>Delete</th>");
	out.println("</tr>");
	
	for (Cart cart : list) {
		out.println("<tr>");
		out.println("<td>"+cart.getProductname()+"</td>");
		out.println("<td>"+cart.getProductbrand()+"</td>");
		out.println("<td>"+cart.getQuantity()+"</td>");
		out.println("<td>"+cart.getPrice()+"</td>");
		out.println("<td><a href='editCart?id="+cart.getId()+"' class='btn btn-info'>Edit</a></td>");
		out.println("<td><a href='deleteCart?id="+cart.getId()+"' class='btn btn-danger'>Delete</a></td>");
		out.println("</tr>");
	}
	
	out.println("</table>");
	out.println("</body>");
	out.println("</html>");
}
	
	
}
