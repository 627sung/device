package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/plus.do")
public class PlusServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int a = Integer.parseInt(req.getParameter("a"));
	int b = Integer.parseInt(req.getParameter("b"));
	int c = a+b;
	req.setAttribute("c", c);
	
	RequestDispatcher dispatcher = req.getRequestDispatcher("/plus.jsp");
	dispatcher.forward(req, resp);
	
}

}
