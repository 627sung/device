package study;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/subway.it")
public class SubwayServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		 int birth = Integer.parseInt( req.getParameter("birth")); 
		 int birthyear =birth/10000;
		 
		 
		 
		 int age = 	 Calendar.getInstance().get(Calendar.YEAR) - birthyear +1;
		 System.out.println(age);
		 
		 int price=0;
		 if(age >=65 || age <8) {
			 price =0;
		 }else if(age >= 20) {
			 price =1250;
		 }else if (age>=14) {
			 price =720;
		 }else if (age >=8) {
			 price = 450;
		 }
		 price = price;
		 	resp.setContentType("text/plain");
		 	resp.setCharacterEncoding("EUC-KR");
		 	resp.getWriter().println( price );

	}
}