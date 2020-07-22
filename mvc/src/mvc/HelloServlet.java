package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello.do")
public class HelloServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//프로그래밍처리 (비즈니스로직)
	String message ="hello mvc2";
	req.setAttribute("message", message);
	
	
	RequestDispatcher dispatcher = req.getRequestDispatcher("/hello.jsp");
	dispatcher.forward(req, resp);
}
}
