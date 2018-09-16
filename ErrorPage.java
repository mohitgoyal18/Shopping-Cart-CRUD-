package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/error-page")
public class ErrorPage extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'>");
	    out.println("</head>");
	    out.println("<body>");
	   out.println("<div class='container'>");
	   out.println("<h1 style='color:red;'>Something Went Wrong Try Again</h1>");
	   out.println("<a href='index.jsp' class='btn btn-danger'>Click Here</a>");
	   out.println("</div>");
	   out.println("</body>");
	   out.println("</html>");
	}
}
