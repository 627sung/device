package study;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//자바파일을 이용하여 웹서비스 구현해보기	
//파일의 실행결과를 브라우저에 띄우고 싶다. 
//직접 만드는 것이 아니라 "상속"으로 구현한다. 
// 이 파일과 연결될 주소를 설정 
@WebServlet(urlPatterns = "/hello.do")

public class HelloServlet extends HttpServlet{
	
 @Override // 프로그래밍 적으려면 메소드가 있어야 합니다. 
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.getWriter().println("hi");
}

		
		
		
		
		
	}


