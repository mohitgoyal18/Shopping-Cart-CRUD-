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
@WebServlet("/editCart")
public class EditCart extends HttpServlet{
  @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	int id=Integer.parseInt(req.getParameter("id"));
	Cart cart=CartDao.getProductById(id);
	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'>");
    out.println("</head>");
    out.println("<body>");
    out.println("<form action='editCartSave' class='form-horizontal' method='post'>");
    out.println("<div class='form-group'>");
    out.println("<div class='col-sm-4'></div>");
    out.println("<div class='col-sm-4'>");
    out.println("<h2 style='text-align: center'>Update Cart</h2>");
    out.println("</div>");
    out.println("</div>");
    out.println("<hr>");
    out.println("<div class='form-group'>");
    out.println("<label class='control-label col-sm-4'>Product Name</label>");
    out.println("<div class='col-sm-4'>");
    out.println("<input type='hidden' name='id' class='form-control' value='"+cart.getId()+"'>");
    out.println("<input type='text' name='productname' class='form-control' value='"+cart.getProductname()+"'>");
    out.println("</div>");
    out.println("</div>");
    out.println("<div class='form-group'>");
    out.println("<label class='control-label col-sm-4'>Product Brand</label>");
    out.println("<div class='col-sm-4'>");
    out.println("<input type='text' name='productbrand' class='form-control' value='"+cart.getProductbrand()+"'>");
    out.println("</div>");
    out.println("</div>");
    out.println("<div class='form-group'>");
    out.println("<label class='control-label col-sm-4'>Quantity</label>");
    out.println("<div class='col-sm-4'>");
    out.println("<input type='text' name='quantity' class='form-control' value='"+cart.getQuantity()+"'>");
    out.println("</div>");
    out.println("</div>");
    out.println("<div class='form-group'>");
    out.println("<label class='control-label col-sm-4'>Price</label>");
    out.println("<div class='col-sm-4'>");
    out.println("<input type='text' name='price' class='form-control' value='"+cart.getPrice()+"'>");
    out.println("</div>");
    out.println("</div>");
    out.println("<div class='form-group'>");
    out.println("<div class='col-sm-4'></div>");
    out.println("<div class='col-sm-4'>");
    out.println("<div class='col-sm-2'>");
    out.println("<input type='submit' value='Update Product' class='btn btn-success' style='width: 120px;'>");
    out.println("</div>");
    out.println("</div>");
    out.println("</div>");
    out.println("</form>");
    out.println("</body>");
    out.println("</html>");
  }
}
