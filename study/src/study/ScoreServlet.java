package study;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/score")
public class ScoreServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		int kor =  Integer.parseInt(req.getParameter("kor")) ;
		int eng =  Integer.parseInt(req.getParameter("eng")) ;
		int math =  Integer.parseInt(req.getParameter("math")) ;

		
		double avg = kor+eng+math/3.0;
		//컨텐츠 유형 설정 
	//	resp.setContentType("text/plain" );
		//resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain:charset=UTF-8"); //위에 두개를 합쳐놓앗음
		resp.getWriter().println("평균 :"+avg);
		
		
		
		
	}
}
