package study;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/plus.kh")
public class plusServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //목표 숫자 2개를 출력받아서 합계를 출력한다. 
		
		//준비
	//	int a = 요청정보에 포함이 된 a의값 (parameter)
	//	int b = 요청정보에 포함이 된 a의값 (parameter)
	// 주의 파라미터를 읽어오면 무조건 스트링이다. 	
		
		//주소에서 ? 뒷부분에 있는 a =xxx부분을 읽어와서 숫자로 바꿔저장!
		int a =Integer.parseInt(req.getParameter("a"));
		//주소에서 ? 뒷부분에 있는 a =xxx부분을 읽어와서 숫자로 바꿔저장!
		int b =Integer.parseInt(req.getParameter("b"));

		//계산
		int c= a+b;

		resp.setCharacterEncoding("EUC-KR"); //한글 처리 
		resp.getWriter().println("합계 : " +c);

	}

}
