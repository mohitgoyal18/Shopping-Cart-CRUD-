package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Cart;
import dao.CartDao;
@WebServlet("/saveToCart")
public class SaveCart extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	String productName=req.getParameter("productname");
	String productBrand=req.getParameter("productbrand");
	int quantity=Integer.parseInt(req.getParameter("quantity"));
	int price=Integer.parseInt(req.getParameter("price"));
	
	Cart cart=new Cart();
	cart.setPrice(price);cart.setProductname(productName);
	cart.setProductbrand(productBrand);cart.setQuantity(quantity);
	int save=CartDao.saveCart(cart);
	if (save>0) {
		resp.sendRedirect("viewAllCart");
	}
	else {
		resp.sendRedirect("error-page");
	}
}
}
