package study;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/random")
public class RandomServlet extends HttpServlet{



	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random r = new Random();
		int dice =  r.nextInt(6)+1;
		resp.setCharacterEncoding("EUC-KR");  //사용자에게 보여주는 값 응답 . 내보낼 내용을 "EUC-KR"로 처리하겟당
		
		resp.getWriter().println("주사위 : "+dice);
	}
	
	
	
}
