package controller;

import java.io.IOException;
// exception handling
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CartDao;
@WebServlet("/deleteCart")
public class DeleteCartProduct extends HttpServlet{
 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		int id=Integer.parseInt(req.getParameter("id"));
		int delete=CartDao.deleteProduct(id);
		resp.sendRedirect("viewAllCart");
	}
}
